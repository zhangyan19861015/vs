package com.zy.ctrl;

import java.util.HashMap;
import java.util.Map;

public class BaseCtrl
{

	public Map<String, Object> ajaxResultSuccess(String info)
    {
    	return ajaxResultJson("1", info, "");
    }
    
    public Map<String, Object> ajaxResultFailure(String info)
    {
    	return ajaxResultJson("0", info, "");
    }
    
    public Map<String, Object> ajaxResultSuccess(String info,Object data)
    {
    	return ajaxResultJson("1", info, data);
    }
    
    public Map<String, Object> ajaxResultFailure(String info,Object data)
    {
    	return ajaxResultJson("0", info, data);
    }
    
    public Map<String, Object> ajaxResultJson(String code,String info,Object data)
    {
    	Map<String, Object> result=new HashMap<String, Object>();
    	result.put("code", code);
    	result.put("info", info);
    	result.put("data", data);
    	return result;
    }

}
