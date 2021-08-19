package cn.th.sharecloud.service.impl;

import cn.th.sharecloud.entity.File;
import cn.th.sharecloud.mapper.FileMapper;
import cn.th.sharecloud.service.FileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Sakura
 * @since 2021-08-19
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements FileService {

}
