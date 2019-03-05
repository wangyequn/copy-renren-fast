package cn.wangyequn.renrenfastcopyapi.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cn.wangyequn.renrenfastcopyapi.sys.entity.SysUser;
import cn.wangyequn.renrenfastcopyapi.sys.service.IUserService;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private IUserService userService;


	/**
     * 授权的时候是对角色授权，而认证的时候应该基于资源，而不是角色，因为资源是不变的，而用户的角色是会变的
     */

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = userService.getUserByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不对");
        }
        return user;
    }
}