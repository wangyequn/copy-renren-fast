package cn.wangyequn.renrenfastcopyapi.sys.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cn.wangyequn.renrenfastcopyapi.sys.entity.SysUser;
import cn.wangyequn.renrenfastcopyapi.sys.entity.User;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public SysUser getUserByName(String username) {
		User user = new User();
		user.setUsername(username);
		QueryWrapper<User> queryWrapper = new QueryWrapper<>(user);
		user = super.getOne(queryWrapper);
		SysUser sysUser = null;
		if(user!= null) {
			sysUser = new SysUser(user);
		}
		return sysUser;
	}

}
