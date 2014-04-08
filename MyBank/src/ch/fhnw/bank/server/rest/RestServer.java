package ch.fhnw.bank.server.rest;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class RestServer {

	public static void main(String[] args) throws IOException {
		final HttpServer server = startServer();
		System.in.read();
		server.stop();
	}
	
	public static HttpServer startServer() {
		final ResourceConfig rc = new ResourceConfig().packages("ch.fhnw.bank.server.rest");
		return GrizzlyHttpServerFactory.createHttpServer(URI.create("http://localhost:8080"), rc);
	}
}
