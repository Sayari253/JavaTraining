package com.tcs.training;

import java.util.Scanner;

public class EmailCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String email = in.next();
		String reg = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9-]+[.][a-zA-z]+$";
		if(email.matches(reg)) {
			System.out.println("Email is verified");
		}
		else
			System.out.println("Email is not verified");
		

	}

}
