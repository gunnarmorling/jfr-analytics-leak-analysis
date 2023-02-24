package org.acme;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	ExecutorService executor = Executors.newSingleThreadExecutor();
    	executor.submit(() -> { 
    		while (true) {
    			Thread.sleep(1000L);
    		}
    	});
        return "Hello RESTEasy";
    }
}