package cn.th.sharecloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class Share implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分享文件夹路径
     */
    private String path;

    /**
     * 共享链接uuid
     */
    private String uuid;

    /**
     * 共享人名称
     */
    private String username;

    /**
     * 是否可用
     */
    private Boolean isOutdated;

    /**
     * 是否取消共享
     */
    private Boolean isCanceled;

    /**
     * 是否是文件夹
     */
    private Boolean isDirectory;

    /**
     * 过期时间
     */
    private LocalDateTime expireTime;


}
