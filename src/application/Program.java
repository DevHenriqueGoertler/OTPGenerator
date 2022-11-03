package application;

import java.util.Scanner;

import model.util.Generator;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Generator gen = new Generator();
		
		System.out.print("Enter password lenght: ");
		int n = sc.nextInt();
		
		System.out.println("One time password: " + gen.generatePassword(n));
		
		sc.close();
	}

}
