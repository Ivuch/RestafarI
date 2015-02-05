package com.restafari.meli.restClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UserRestClient {

	public UserRestClient(){
	}
	
	public void printUser1234(){
	try {
		 
		URL url = new URL("https://api.mercadolibre.com/users/1234");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));//oAuth de MeLi talvez soluciona el problema de SSL (Secure Cocket Layer)
 
		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}
 
		conn.disconnect();
 
	  } catch (MalformedURLException e) {
 
		e.printStackTrace();
 
	  } catch (IOException e1) {
 
		e1.printStackTrace();
 
	  }
 
	}
}


	

