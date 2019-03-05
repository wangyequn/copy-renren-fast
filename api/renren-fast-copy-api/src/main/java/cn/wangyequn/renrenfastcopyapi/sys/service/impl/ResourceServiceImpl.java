package cn.wangyequn.renrenfastcopyapi.sys.service.impl;

import cn.wangyequn.renrenfastcopyapi.sys.entity.Resource;
import cn.wangyequn.renrenfastcopyapi.sys.mapper.ResourceMapper;
import cn.wangyequn.renrenfastcopyapi.sys.service.IResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表（菜单、功能） 服务实现类
 * </p>
 *
 * @author yequn
 * @since 2019-02-21
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {

}
