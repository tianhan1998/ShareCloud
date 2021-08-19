package cn.th.sharecloud.service;

import cn.th.sharecloud.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Sakura
 * @since 2021-08-19
 */
public interface UserService extends IService<User> {

    User getUserByEmail(String email);
}
