package ideas.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class[] classes = new Class[] { ApplicationConfig.class };
		
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}






