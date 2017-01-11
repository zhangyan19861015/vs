package com.zy.ctrl;
/*
 * 返回json数据或者String数据：
 * 那么需要在方法上加上注解：@ResponseBody
 * 添加return即可。
 */

/*
 * 返回视图：
 * 定义一个ModelAndView即可，
 * 然后return;
 * 定义视图文件(比如：error.html,error.ftl,error.jsp);
 *
 */
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
@ControllerAdvice
public class ErrorCtrl extends BaseCtrl
{
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public Map<String, Object> doException(HttpServletRequest request, Exception e)
	{
		String spath=request.getServletPath();
		return super.ajaxResultFailure("处理【"+spath+"】发生异常123："+e.getMessage());
	}
}
