package com.yuanqi.otms.controller.converter;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
* @Title: CustomDateConverter.java 
* @Package com.yuanqi.otms.controller.converter 
* @Description: TODO自定义日期转换器 
* @author 元启智能   李晓刚
* @date 2015年7月10日 下午2:56:25 
* @version V1.0
 */
public class CustomDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		
		try {
			//进行日期转换
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(source);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
