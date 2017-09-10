package com.packt.patterninspring.chapter11.web.reactive.function;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RequestPredicates.contentType;
import static org.springframework.web.reactive.function.server.RequestPredicates.method;
import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.http.HttpMethod;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.http.server.reactive.ServletHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.packt.patterninspring.chapter11.web.reactive.repository.AccountRepository;
import com.packt.patterninspring.chapter11.web.reactive.repository.AccountRepositoryImpl;

import reactor.ipc.netty.http.server.HttpServer;

public class Server {

	public static final String HOST = "localhost";

	public static final int TOMCAT_PORT = 8080;
	public static final int REACTOR_PORT = 8181;

	public static void main(String[] args) throws Exception {
		Server server = new Server();
		server.startReactorServer();
		server.startTomcatServer();

		System.out.println("Press ENTER to exit.");
		System.in.read();
	}

	public RouterFunction<ServerResponse> routingFunction() {
		AccountRepository repository = new AccountRepositoryImpl();
		AccountHandler handler = new AccountHandler(repository);

		return nest(path("/account"),
				nest(accept(APPLICATION_JSON),
						route(GET("/{id}"), handler::findById)
						.andRoute(method(HttpMethod.GET), handler::findAll)
				).andRoute(POST("/").and(contentType(APPLICATION_JSON)), handler::create));
	}

	public void startReactorServer() throws InterruptedException {
		RouterFunction<ServerResponse> route = routingFunction();
		HttpHandler httpHandler = toHttpHandler(route);

		ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(httpHandler);
		HttpServer server = HttpServer.create(HOST, REACTOR_PORT);
		server.newHandler(adapter).block();
	}

	public void startTomcatServer() throws LifecycleException {
		RouterFunction<?> route = routingFunction();
		HttpHandler httpHandler = toHttpHandler(route);

		Tomcat tomcatServer = new Tomcat();
		tomcatServer.setHostname(HOST);
		tomcatServer.setPort(TOMCAT_PORT);
		Context rootContext = tomcatServer.addContext("", System.getProperty("java.io.tmpdir"));
		ServletHttpHandlerAdapter servlet = new ServletHttpHandlerAdapter(httpHandler);
		Tomcat.addServlet(rootContext, "httpHandlerServlet", servlet);
		rootContext.addServletMapping("/", "httpHandlerServlet");
		tomcatServer.start();
	}

}
