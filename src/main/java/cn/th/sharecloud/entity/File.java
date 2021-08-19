package cn.th.sharecloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 文件实际存放路径
     */
    private String path;

    /**
     * 文件本体名称
     */
    private String fileName;

    /**
     * 磁盘上带虚拟id名称
     */
    private String idFileName;

    /**
     * 文件字节大小
     */
    private String size;

    /**
     * 上传人名称
     */
    private String username;


}
