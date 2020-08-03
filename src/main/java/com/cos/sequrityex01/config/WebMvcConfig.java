package com.cos.sequrityex01.config;

import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig implements WebMvcConfigurer{
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	
		MustacheViewResolver resolver = new MustacheViewResolver();
		resolver.setCharset("utf-8");
		resolver.setContentType("text/html;charset=utf-8");
		resolver.setPrefix("classpath:/templates");
		resolver.setSuffix(".html");
		
		registry.viewResolver(resolver);
		
	}
}
