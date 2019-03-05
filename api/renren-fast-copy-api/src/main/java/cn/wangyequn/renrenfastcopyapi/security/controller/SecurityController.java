package cn.wangyequn.renrenfastcopyapi.security.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.wangyequn.renrenfastcopyapi.common.Result;

@RestController
public class SecurityController {
	
	@RequestMapping(value="/noauth",method=RequestMethod.GET)
	public Result noAuth() {
		return Result.NOAUTH;
	}
	@RequestMapping(value="/loginFail",method=RequestMethod.GET)
	public Result loginFail() {
		return Result.LOGIN_FAIL;
	}
}
