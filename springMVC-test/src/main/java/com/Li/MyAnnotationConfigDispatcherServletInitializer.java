package com.Li;

import com.Li.config.SpringConfig;
import com.Li.controller.SpringMVCConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author : xingpeng
 * @date : 2021-09-28 14:57
 **/
public class MyAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override //根容器的配置（spring的配置类/配置文件）
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override //web容器的配置（springMVC的配置类/配置文件）
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override //映射路径
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
