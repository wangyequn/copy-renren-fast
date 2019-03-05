package cn.wangyequn.renrenfastcopyapi.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;

import cn.wangyequn.renrenfastcopyapi.sys.entity.SysUser;
import cn.wangyequn.renrenfastcopyapi.sys.entity.User;

/**
 * <p>
 * 用户主表 服务类
 * </p>
 *
 * @author yequn
 * @since 2019-02-20
 */
public interface IUserService extends IService<User> {

	SysUser getUserByName(String username);

}
