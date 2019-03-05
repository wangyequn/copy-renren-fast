package cn.wangyequn.renrenfastcopyapi.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import cn.wangyequn.renrenfastcopyapi.common.BaseEntity;

/**
 * <p>
 * 系统角色表
 * </p>
 *
 * @author yequn
 * @since 2019-02-21
 */
@TableName("sys_role")
public class Role extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    /**
     * 角色英文名称
     */
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Role{" +
        "name=" + name +
        ", remark=" + remark +
        ", code=" + code +
        "}";
    }
}
