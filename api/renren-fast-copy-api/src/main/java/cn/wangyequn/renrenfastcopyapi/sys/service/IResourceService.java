package cn.wangyequn.renrenfastcopyapi.sys.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

import cn.wangyequn.renrenfastcopyapi.sys.entity.Resource;

/**
 * <p>
 * 资源表（菜单、功能） 服务类
 * </p>
 *
 * @author yequn
 * @since 2019-02-21
 */
public interface IResourceService extends IService<Resource> {
	
	@Override
	public List<Resource> list();
}
