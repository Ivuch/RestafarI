package com.restafari.DBConnections;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class MongoDBConnection {

	DBObject document;
	MongoClient client;
	DBCollection collection;
	
	public MongoDBConnection() throws UnknownHostException{
		 this.client = new MongoClient(new ServerAddress("localhost", 27017));
	}
	
	public DBCollection getCollection(String collectionName){
		 DB database = client.getDB("poker");
		 this.collection = database.getCollection(collectionName);
		return collection;
	}
	
	public DBObject getOne(){
		document = collection.findOne();
		 System.out.print(document);
		return document;
	}
	
	public DBObject getJSON(){
		return document;
	}
}
