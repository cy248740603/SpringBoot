package cy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CyConfig.class);
		// UseService useService = context.getBean(UseService.class);
//		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

		// BeanWayService beanWayService = context.getBean(BeanWayService.class);
		// JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
		
//		context.close();
		// System.out.printf(useService.sayHelloString("a"));
//		System.out.println(useFunctionService.SayHello("b"));

		// AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AopConfig.class);
		// DemoAnnotationService demoAnnotationService = context2.getBean(DemoAnnotationService.class);
		// DemoMethodService demoMethodService = context2.getBean(DemoMethodService.class);
		// demoAnnotationService.add();
		// demoMethodService.add();
		// context2.close();

		// AnnotationConfigApplicationContext el = new AnnotationConfigApplicationContext(ElConfig.class);
		// ElConfig resourceService = el.getBean(ElConfig.class);
		// resourceService.outputResource();
		// el.close();
	}
}
