package com.wolken.wolkenapp;

public class Bouncer {
	
	public void check(int age) throws PubException { //In compile time we should write throws to handle exception
		if(age > 21) {
			System.out.println("Yeh!!!! You are in the PUB!!!!");
		}
		else {
			System.out.println("Not welcome!!!");
			throw new PubException();
			/*
			 * // we can also write this above line as: 
			 * PubException exception = new PubException();
			 * throw exception;
			 */
		}
	}

}
