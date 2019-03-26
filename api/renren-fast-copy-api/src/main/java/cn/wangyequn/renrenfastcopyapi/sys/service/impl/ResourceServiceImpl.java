package cn.wangyequn.renrenfastcopyapi.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cn.wangyequn.renrenfastcopyapi.sys.entity.Resource;
import cn.wangyequn.renrenfastcopyapi.sys.entity.Role;
import cn.wangyequn.renrenfastcopyapi.sys.mapper.ResourceMapper;
import cn.wangyequn.renrenfastcopyapi.sys.mapper.RoleMapper;
import cn.wangyequn.renrenfastcopyapi.sys.service.IResourceService;

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
	
	@Autowired
	ResourceMapper resourceMapper;
	
	@Autowired
	RoleMapper roleMapper;
	
	@Override
	public List<Resource> list() {
		List<Resource> list = super.list();
		for (Resource resource : list) {
			String resourceId = resource.getId();
			List<Role> roles = roleMapper.getListByResourceId(resourceId);
			resource.setRoles(roles);
		}
		return list;
	}

}
