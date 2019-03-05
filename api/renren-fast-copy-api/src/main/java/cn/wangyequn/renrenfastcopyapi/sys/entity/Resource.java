package cn.wangyequn.renrenfastcopyapi.sys.entity;

import java.util.List;

import com.baomidou.mybatisplus.annotation.TableName;
import cn.wangyequn.renrenfastcopyapi.common.BaseEntity;

/**
 * <p>
 * 资源表（菜单、功能）
 * </p>
 *
 * @author yequn
 * @since 2019-02-21
 */
@TableName("sys_resource")
public class Resource extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconCls;

    private Boolean keepAlive;

    private Boolean requireAuth;

    private String parentId;
    
    private List<Role> roles;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }
    public Boolean getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }
    public Boolean getRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(Boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    
    public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
    public String toString() {
        return "Resource{" +
        "url=" + url +
        ", path=" + path +
        ", component=" + component +
        ", name=" + name +
        ", iconCls=" + iconCls +
        ", keepAlive=" + keepAlive +
        ", requireAuth=" + requireAuth +
        ", parentId=" + parentId +
        "}";
    }
}
