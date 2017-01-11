package com.zy.ctrl;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AdminCtrl extends BaseCtrl
{
	@RequestMapping("/getres")
	public Map<String, Object> getResult()
	{
		return super.ajaxResultSuccess("你在做什么？");
	}
	
	@RequestMapping("/doerr")
	public int doError()
	{
		int i=100/0;
		return i;
	}
}
