package cn.wangyequn.renrenfastcopyapi.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import cn.wangyequn.renrenfastcopyapi.common.BaseEntity;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * <p>
 * 用户主表
 * </p>
 *
 * @author yequn
 * @since 2019-02-20
 */
@TableName("sys_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态（0：锁定；1：可用）
     */
    private String status;

    /**
     * 是否删除（0：未删除；1：已删除）
     */
    private String deleted;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 排序号
     */
    @TableField("sortNo")
    private Integer sortNo;

    /**
     * 盐值
     */
    @TableField("saltValue")
    private String saltValue;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }
    public String getSaltValue() {
        return saltValue;
    }

    public void setSaltValue(String saltValue) {
        this.saltValue = saltValue;
    }

    @Override
    public String toString() {
        return "User{" +
        "username=" + username +
        ", password=" + password +
        ", status=" + status +
        ", deleted=" + deleted +
        ", createTime=" + createTime +
        ", sortNo=" + sortNo +
        ", saltValue=" + saltValue +
        "}";
    }
}
