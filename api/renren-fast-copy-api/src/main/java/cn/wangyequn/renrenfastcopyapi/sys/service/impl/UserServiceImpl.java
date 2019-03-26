package cn.wangyequn.renrenfastcopyapi.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cn.wangyequn.renrenfastcopyapi.sys.entity.Role;
import cn.wangyequn.renrenfastcopyapi.sys.entity.SysUser;
import cn.wangyequn.renrenfastcopyapi.sys.entity.User;
import cn.wangyequn.renrenfastcopyapi.sys.mapper.RoleMapper;
import cn.wangyequn.renrenfastcopyapi.sys.mapper.UserMapper;
import cn.wangyequn.renrenfastcopyapi.sys.service.IUserService;

/**
 * <p>
 * 用户主表 服务实现类
 * </p>
 *
 * @author yequn
 * @since 2019-02-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService,UserDetailsService {

	@Autowired
	RoleMapper roleMapper;
	
	@Override
	public User getUserByName(String username) {
		User user = new User();
		user.setUsername(username);
		QueryWrapper<User> queryWrapper = new QueryWrapper<>(user);
		user = super.getOne(queryWrapper);
		SysUser sysUser = null;
		return sysUser;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = this.getUserByName(username);
		if(user==null) {
			throw new UsernameNotFoundException("用户不存在");
		}
		List<Role> roles = this.getRolesByUser(user);
		SysUser sysuser = new SysUser(user,roles);
		return sysuser;
	}

	@Override
	public List<Role> getRolesByUser(User user) {
		if(user==null) {
			throw new UsernameNotFoundException("用户查询角色的用户为空");
		}
		String userId = user.getId();
		List<Role> roles;
		if(userId!=null) {
			roles = roleMapper.getRolesByUserId(userId);			
		} else {
			roles = new ArrayList<>();
		}
		return roles;
	}

}
