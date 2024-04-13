package com.web.java;

import java.util.Scanner;

public class KilometersToMeters_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the distance in kilometers");
		int kilometers=sc.nextInt();
		int meters=kilometers*1000;
		System.out.println("kilometers convert into meters="+meters);

	}

}
