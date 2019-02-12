package cn.wangyequn.renrenfastcopyapi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControlloer {
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public Map<String,String> init() {
		Map<String,String> map = new HashMap<>();
		map.put("text1", "text1");
		map.put("text2", "text2");
		map.put("text3", "text4");
		return map;
	}
}
