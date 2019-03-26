package cn.wangyequn.renrenfastcopyapi.sys.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

import cn.wangyequn.renrenfastcopyapi.sys.entity.Role;
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

	User getUserByName(String username);
	

	List<Role> getRolesByUser(User user);
}
