package com.wolken.wolkenapp;

//custom un-checked exception
/*
 * public class PubException extends RuntimeException{ }
 */

//custom checked exception(compile time exception)
public class PubException extends Exception{
	@Override 
	public String getMessage() {
		return "Age below 21 not allowed";
	}
	
	@Override
	public String toString() {
		return "Go Home!!";
	}
}