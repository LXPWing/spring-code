import config.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
		DispatcherServlet servlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = container.addServlet("app", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/app/*");
    }

}