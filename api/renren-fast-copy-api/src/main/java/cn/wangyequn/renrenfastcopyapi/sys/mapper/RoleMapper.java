package cn.wangyequn.renrenfastcopyapi.sys.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import cn.wangyequn.renrenfastcopyapi.sys.entity.Role;

/**
 * <p>
 * 系统角色表 Mapper 接口
 * </p>
 *
 * @author yequn
 * @since 2019-02-21
 */
public interface RoleMapper extends BaseMapper<Role> {

	List<Role> getListByResourceId(String resourceId);

	List<Role> getRolesByUserId(String userId);

}
