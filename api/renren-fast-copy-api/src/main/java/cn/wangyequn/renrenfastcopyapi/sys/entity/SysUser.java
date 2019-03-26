package cn.wangyequn.renrenfastcopyapi.sys.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import cn.wangyequn.renrenfastcopyapi.constant.Constant;

public class SysUser extends User implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3543991511015519008L;

	private SysUser() {
		super();
	}

	public SysUser(User user, List<Role> roles) {
		this();
		if (user != null) {
			super.setCreateTime(user.getCreateTime());
			super.setDeleted(user.getDeleted());
			super.setId(user.getId());
			super.setPassword(user.getPassword());
			super.setSaltValue(user.getSaltValue());
			super.setSortNo(user.getSortNo());
			super.setStatus(user.getStatus());
			super.setUsername(user.getUsername());
		}
		if (roles != null) {
			this.roles = roles;
		} else {
			this.roles = new ArrayList<>();
		}

	}

	private List<Role> roles;

	// 获取用户所具有的角色
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (Role role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getCode()));
		}
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return Constant.TRUE.equals(super.getStatus());
	}

}
