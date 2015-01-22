package com.restafari.controller;


import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.restafari.DBConnections.MongoDBConnection;

@Path("/user")
public class RegisterUserForm {
	
	@POST
	public Response getMsg(@FormParam("name") String name, @FormParam("lname") String lname,
							@FormParam("pass") String pass, @FormParam("confirmPass") String confirmPass, 
						   @FormParam("email") String email) throws URISyntaxException {
		 
/*
 * Connection to MonogDB, this code could be implemented in another class and then injected here,
 * 		plus this code implements caching the error exeption throws by MongoDB
 */
		MongoDBConnection mongoDBC;
		try {
			mongoDBC = new MongoDBConnection();
		} catch (Exception e) {
			System.out.print("HOLA");
			e.printStackTrace();
			return Response.temporaryRedirect(new URI("../server500error.jsp")).entity(e.getMessage()).build();
		}
		 DBCollection s =  mongoDBC.getCollection("mypoker");
		BasicDBObject doc = new BasicDBObject("name", name)
        .append("lname", lname)
        .append("pass", pass)
        .append("email", email);
		
		s.insert(doc);
		//continuar con el .insert(DBObject <<-- como se forma este?) CRUD MongoDB
		
		return Response.status(200).entity(name+pass+lname+confirmPass+email+mongoDBC.getOne()).build();
 
	}
}