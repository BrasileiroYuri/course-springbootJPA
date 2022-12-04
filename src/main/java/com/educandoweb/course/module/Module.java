package com.educandoweb.course.module;

import com.codahale.passpol.BreachDatabase;
import com.codahale.passpol.PasswordPolicy;

public class Module {
	private String metod() {
		PasswordPolicy policy = new PasswordPolicy(BreachDatabase.haveIBeenPwned(5), 8, 64);
		
		
		return "oi";
	}
	
}
