package com.restafari.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class BaseController {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msgs) {
 
		String output = msgs;
 
		return Response.status(200).entity(output).build();
 
	}
}
