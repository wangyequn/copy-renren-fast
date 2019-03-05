package cn.wangyequn.renrenfastcopyapi.sys.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wangyequn.renrenfastcopyapi.common.BaseController;
import cn.wangyequn.renrenfastcopyapi.common.Result;

/**
 * <p>
 * 用户主表 前端控制器
 * </p>
 *
 * @author yequn
 * @since 2019-02-20
 */
@RestController
public class UserController extends BaseController {
	
	@PostMapping("/login")
	private Result login(String username,String password) {
		System.out.println("尝试登录\n用户名:"+username +"\n密码:"+password);
		Result result =  new Result();
		return result;
	}
}
