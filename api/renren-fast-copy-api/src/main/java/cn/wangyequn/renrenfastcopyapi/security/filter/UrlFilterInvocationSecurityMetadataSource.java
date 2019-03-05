package cn.wangyequn.renrenfastcopyapi.security.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;

import cn.wangyequn.renrenfastcopyapi.sys.entity.Resource;
import cn.wangyequn.renrenfastcopyapi.sys.entity.Role;
import cn.wangyequn.renrenfastcopyapi.sys.service.IResourceService;

// 判断当前请求的URL所需要的用户角色
public class UrlFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

	@Autowired
	IResourceService resourceService;
	AntPathMatcher antPathMatcher = new AntPathMatcher();
	@Override
	public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
		// 获取请求地址
		String requestUrl = ((FilterInvocation) o).getRequestUrl();
		if ("/login_p".equals(requestUrl)) {
			return null;
		}
		List<Resource> allMenu = resourceService.list();
		if(allMenu == null) {
			allMenu = new ArrayList<>();
		}
		for (Resource resource : allMenu) {
			if (antPathMatcher.match(resource.getUrl(), requestUrl) && resource.getRoles().size() > 0) {
				List<Role> roles = resource.getRoles();
				int size = roles.size();
				String[] values = new String[size];
				for (int i = 0; i < size; i++) {
					values[i] = roles.get(i).getName();
				}
				return SecurityConfig.createList(values);
			}
		}
		// 没有匹配上的资源，都是登录访问
		return SecurityConfig.createList("ROLE_LOGIN");
	}
	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

	@Override
	public boolean supports(Class<?> aClass) {
		return FilterInvocation.class.isAssignableFrom(aClass);
	}

}
