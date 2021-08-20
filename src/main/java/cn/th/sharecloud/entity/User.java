package cn.th.sharecloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Sakura
 * @since 2021-08-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    @Size(min = 4,max = 20,message = "密码长度不能小于4位，最大不能超过20位")
    private String password;

    @Email(message = "邮箱格式有误")
    private String email;

    private Boolean isActived;

    private Boolean isBanned;

    /**
     * 激活码
     */
//    @NotBlank(message = "邀请码不能为空")
    private String activeCoder;


}
