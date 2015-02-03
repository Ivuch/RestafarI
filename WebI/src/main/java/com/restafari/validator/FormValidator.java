package com.restafari.validator;

import org.springframework.beans.factory.annotation.Autowired;


import com.restafari.resources.Resources;


public class FormValidator {
	
	@Autowired
	Resources resources;
	
	public FormValidator(){}
	
	public void ValidateForm(String content){
		System.out.println(resources.getLetters()+content);
		
	}
	
}
