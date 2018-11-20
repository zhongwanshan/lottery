package com.lottery;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@SpringBootApplication
@MapperScan("com.lottery.dao.*")
public class LotteryApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(LotteryApplication.class, args);
	}
	
	 @Override
	    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

	        //定义一个转换消息的对象
	        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

	        //添加fastjson的配置信息 比如 ：是否要格式化返回的json数据
	        FastJsonConfig fastJsonConfig = new FastJsonConfig();

	        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

	        //在转换器中添加配置信息
	        fastConverter.setFastJsonConfig(fastJsonConfig);

	        //将转换器添加到converters中
	        converters.add(fastConverter);
	    }
	
	 
}
