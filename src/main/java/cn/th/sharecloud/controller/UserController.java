package cn.th.sharecloud.controller;


import cn.th.sharecloud.entity.Result;
import cn.th.sharecloud.entity.User;
import cn.th.sharecloud.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
            return Result.successResult("此邮箱可以注册");
        }else{
            return Result.failResult("此邮箱已被注册");
        }
    }

}
