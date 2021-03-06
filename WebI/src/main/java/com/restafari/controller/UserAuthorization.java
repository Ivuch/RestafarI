package com.restafari.controller;


import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restafari.dbconnections.MongoDBConnection;
import com.restafari.validator.FormValidator;

@Component
@Path("/auth")
public class UserAuthorization {
	
	 
	@Autowired
	FormValidator formValidator;

	@POST
	public Response getMsg(@FormParam("user") String user, 
			@FormParam("pass") String pass) throws URISyntaxException {
		 

		MongoDBConnection mongoDBC;
		try {
			mongoDBC = new MongoDBConnection();
		} catch (Exception e) {
			System.out.print("HOLA");
			e.printStackTrace();
			
//			return Response.status(500).entity("see the log console for more information").build();
			return Response.temporaryRedirect(new URI("../server500error.jsp")).entity(e.getMessage()).build();
		}
		String output;
		if(user.equals("ivuch") && pass.equals("Monkey8")){
			 output = "ok";
		}else{
			 output = "false";
		}
		formValidator.ValidateForm("hey");
		
		return Response.status(200).entity(output+user+pass+mongoDBC.getJSON()).build();
 
	}
}