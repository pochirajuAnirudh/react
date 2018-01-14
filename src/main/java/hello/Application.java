package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(Application.class);
	    }
	
	public static void main(String[] args) {
		System.out.println("IN the Main method line no: 10");
		SpringApplication.run(Application.class, args);
		System.out.println("IN the Main method line no: 12");
		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println("IN the Main method line no: 14" + gwc.toString());
		System.out.println(gwc.getResult());
		System.out.println("IN the Main method line no: 16");
	}
}
