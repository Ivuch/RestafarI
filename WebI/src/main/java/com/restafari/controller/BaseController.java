package com.restafari.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restafari.meli.restClients.UserRestClient;
 
@Component
@Path("/hello")
public class BaseController {
 
	@Autowired
	UserRestClient UserRC;
	
	@GET
	@Path("/{param}")
	@Produces("application/json")
	public Response getMsg(@PathParam("param") String msgs) {
 
		String output = msgs;
		UserRC.printUser1234();//Dentro de esta f(x)= se encuentra el problema de SSL
		return Response.status(200).entity(output).build();
 
	}
}
