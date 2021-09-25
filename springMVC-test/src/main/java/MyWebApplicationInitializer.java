import config.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {
    	//创建ioc容器
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		//传入配置类
		context.register(AppConfig.class);
		//以上截至ioc容器都没有启动
		//配置DispatcherServlet,利用Servlet的初始化机制来启动ioc容器
		DispatcherServlet servlet = new DispatcherServlet(context);
		//将Servlet添加到ServletContext里面,Tomcat就会对DispatcherServlet进行初始化（init）
        ServletRegistration.Dynamic registration = container.addServlet("app", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        //映射路径
        registration.addMapping("/app/*");
    }

}