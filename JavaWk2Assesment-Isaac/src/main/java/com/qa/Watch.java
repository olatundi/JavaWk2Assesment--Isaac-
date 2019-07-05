package com.qa;

import java.util.Random;
import java.util.Scanner;

public class Watch {
	
	public void terrainWatch() {
		boolean sea = true;
		int count = 0;
		double res =0;
		double resx =0;
		double resy =0;
		double resxn =0;
		double resyn =0;
		double difx =0;
		double dify =0;
		double difxn =0;
		double difyn =0;
		double x =0;
		double y =0;
		double newX=0;
		double newY=0;
		double newXn=0;
		double newYn=0;
		String str = "";
//		Random r = new Random();
//		double xar = r.nextInt(20);
//		double yar = r.nextInt(25);
//		res = Math.hypot(xar, yar);
		System.out.println("How many meter does the dial read?");
		Scanner scan = new Scanner(System.in);
		double meter = Double.parseDouble(scan.nextLine());
		difx = meter;
		dify = meter;
		boolean debugging = false;
		do {			
			System.out.println("What direction would you like to go? (north, south, east, west)");

			String dir = scan.nextLine();
			
			if (dir.toLowerCase().equals("east")) {
				double xa= x ; 
				xa++; 
				newX=0;
				
				resx = Math.hypot(xa, y);
				res=meter-resx ;
				res = Math.abs(res);
				if (debugging) {
//				System.out.println("The distance "+ String.valueOf(resx));
				}
				difx = res;
				
				System.out.println("The dial reads "+ String.valueOf(difx));
				x= xa;		
				if (debugging) {
				System.out.println(x);
							
				}
//				else {
//					newX = xa-1;
//				}
//	
			}
			else if (dir.toLowerCase().equals("north")) {		
				double ya= y;
				ya++; 
				newY=0;
					
				resy = Math.hypot(x, ya);

				res= meter-resy; 
				res = Math.abs(res);
				if (debugging) {
//					res = Math.abs(res);
//					System.out.println("The distance "+ String.valueOf(resxy));
				}
				dify = res;
				System.out.println("The dial reads "+ String.valueOf(dify));
				y= ya;
				if (debugging) {
				System.out.println(y);
				}
			}
			
			else if (dir.toLowerCase().equals("west")) {
				double xa= x ; 
				xa--;
				newXn=0;
				resxn = Math.hypot(xa, y);
				res= meter-resxn; 
				res = Math.abs(res);
				if (debugging) {
//					res = Math.abs(res);
//					System.out.println("The distance "+ String.valueOf(resxn));
				}
				difx = res;
				System.out.println("The dial reads "+ String.valueOf(difx));
				x= xa;
				if (debugging) {
					System.out.println(x);	
				}
			}
			
			else if (dir.toLowerCase().equals("south")) {
				double ya= y ; 
				ya--;
				newYn=0;
				
				resyn = Math.hypot(x, ya);
				res= meter-resyn; 
				res = Math.abs(res);
				if (debugging) {
//					res = Math.abs(res);
//					System.out.println("The distance "+ String.valueOf(resyn));
				}

				dify = res;
				System.out.println("The dial reads "+ String.valueOf(dify));
				y= ya;		
				if (debugging) {
				System.out.println(y);
				}
			}
			
			else {
				System.out.println("Please enter valid fields and try again!");
			}
//			for (double xa= x ; resx<meter; xa++) {
//				newX=0;
//				
//				resx = Math.hypot(xa, y);
////				resy = Math.hypot(0, y);
//				res= meter-resx; 
//				
//				if( res< difx) {
//					difx = res;
//					newX= xa;					
//					
//				}
//				else {
//					newX = xa-1;
//					break;
//				}
//				
//			}
//					
//			for (double ya= y ; resy < meter; ya++) {
//				newY=0;
//				
//				resy = Math.hypot(x, ya);
////				resy = Math.hypot(0, y);
//				res= meter-resy; 
//				
//				if( res< dify) {
//					dify = res;
//					newY= ya;					
//					
//				}
//				else {
//					newY = ya-1;
//					break;
//				}				
//			}
//			
//			for (double xa= x ; resx<meter; xa--) {
//				newXn=0;
//				
//				resxn = Math.hypot(xa, y);
////				resy = Math.hypot(0, y);
//				res=meter-resxn; 
//				
//				if( res< difx) {
//					difx = res;
//					newXn= xa;					
//					
//				}
//				else {
//					newXn = xa+1;
//					break;
//				}
//				
//			}
//			
//			for (double ya= y ; resy < meter; ya--) {
//				newYn=0;
//				
//				resyn = Math.hypot(x, ya);
//				res= meter-resyn; 
//				
//				if( res< difyn) {
//					dify = res;
//					newYn= ya;					
//					
//				}
//				else {
//					newYn = ya+1;
//					break;
//				}				
//			}
//			
//			if(Math.abs(newX)> Math.abs(newXn)
//					&& Math.abs(newX) > Math.abs(newYn) && Math.abs(newX) > Math.abs(newY)) {
//				
////				x = newX;
//				str= "east";
//				System.out.println(newX);
//				
//			}
//			
//			else if(Math.abs(newY)> Math.abs(newXn) && Math.abs(newY) > Math.abs(newXn)
//					&& Math.abs(newY) > Math.abs(newYn)) {
////				y = newY;
//				str= "north";	
//			}
//			
//			else if(Math.abs(newYn)> Math.abs(newXn) && Math.abs(newYn) > Math.abs(newXn)
//					&& Math.abs(newYn) > Math.abs(newY)) {
////				y = newYn;
//				str= "south";	
//			}
//			
//			else if(Math.abs(newXn)> Math.abs(newX) && Math.abs(newXn) > Math.abs(newYn)
//					&& Math.abs(newXn) > Math.abs(newY)) {
////				y = newXn;
//				str= "west";	
//			}
//
//			System.out.println("Suggestion: You should go "+ str+ " next");


			if (Math.abs(difx)<0.1||Math.abs(dify)<0.1) {
				System.out.println("You see a box sitting on the plain. Its filled with treasure! You win! The end.");
				sea = false;
			}

		}
		while(sea);
		scan.close();
	}
}
