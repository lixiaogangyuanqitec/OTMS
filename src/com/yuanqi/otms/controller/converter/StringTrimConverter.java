package com.yuanqi.otms.controller.converter;



import org.springframework.core.convert.converter.Converter;

/**
 * 
* @Title: StringTrimConverter.java 
* @Package com.yuanqi.otms.controller.converter 
* @Description: TODO自定义日期转换器
* @author 元启智能   李晓刚
* @date 2015年7月10日 下午2:56:14 
* @version V1.0
 */
public class StringTrimConverter implements Converter<String, String> {

	@Override
	public String convert(String source) {
		
		try {
			//去掉字符串两边空格，如果去除后为空设置为null
			if(source!=null){
				source = source.trim();
				if(source.equals("")){
					return null;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return source;
	}

}
