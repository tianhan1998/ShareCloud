package cn.th.sharecloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class Invitecode implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 激活码
     */
    private String code;

    /**
     * 是否已用
     */
    private Boolean isUsed;

    /**
     * 激活人
     */
    private String username;


}
