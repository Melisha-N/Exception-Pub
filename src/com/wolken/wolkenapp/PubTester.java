
package com.wolken.wolkenapp;

public class PubTester {
	public static void main(String[] args) throws PubException {
		Bouncer bouncer = new Bouncer();
		try {
			bouncer.check(12);
		} catch (PubException e) {
			System.out.println("INSIDE CATCH");
			PubException excp = new PubException();
			// excp.getMessage();
			System.out.println(excp.getMessage());
			System.out.println(excp.toString());
		}
		
	}
}
