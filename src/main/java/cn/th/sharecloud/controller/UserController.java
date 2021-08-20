package cn.th.sharecloud.controller;


import cn.th.sharecloud.entity.Result;
import cn.th.sharecloud.entity.User;
import cn.th.sharecloud.service.UserService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

import static cn.th.sharecloud.entity.Result.failResult;
import static cn.th.sharecloud.entity.Result.successResult;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Sakura
 * @since 2021-08-19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/emailCheck")
    public Result<Object> checkUserByEmail(@RequestParam String email){
        User user = userService.getUserByEmail(email);
        if(user==null){
            return successResult("此邮箱可以注册");
        }else{
            return failResult("此邮箱已被注册");
        }
    }

    @PostMapping("/register")
    public Result<Object> register(@RequestBody @Valid User user){
        User newUser = userService.getUserByEmail(user.getEmail());
        Result<Object> result;
        if(newUser==null){
            if(userService.save(user)) {
                result = successResult("注册成功");
            }else{
                result = failResult("数据库插入失败");
            }
        }else{
            result= failResult("用户已存在");
        }
        return result;
    }

    @PostMapping("/login")
    public Result<Object> login(@RequestBody User user){
        User findUser = userService.getUserByEmail(user.getEmail());
        Result<Object> result;
        if(StringUtils.hasText(user.getEmail())&& StringUtils.hasText(user.getPassword())) {
            if (findUser != null) {
                if (findUser.getPassword().equals(user.getPassword())) {
                    if (findUser.getIsActived()) {
                        if (!findUser.getIsBanned()) {
                            result = successResult("登陆成功");
                        } else {
                            result = failResult("用户已封禁");
                        }
                    } else {
                        result = failResult("用户未激活");
                    }
                } else {
                    result = failResult("用户名或密码错误");
                }
            } else {
                result = failResult("用户名或密码错误");
            }
        }else{
            result=failResult("用户名和密码不能为空");
        }
        return result;
    }

}
