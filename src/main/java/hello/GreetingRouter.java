package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class GreetingRouter {

	@Bean
	public RouterFunction<ServerResponse> route(GreetingHandler greetingHandler) {
		
		System.out.println("In the greeting Router line no: 17");
		return RouterFunctions
			.route(RequestPredicates.GET("/helloRaghu").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), greetingHandler::helloRaghu);
	}
}
