package cn.th.sharecloud.service.impl;

import cn.th.sharecloud.entity.Share;
import cn.th.sharecloud.mapper.ShareMapper;
import cn.th.sharecloud.service.ShareService;
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
public class ShareServiceImpl extends ServiceImpl<ShareMapper, Share> implements ShareService {

}
