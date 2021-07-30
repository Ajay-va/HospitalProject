package com.app.demo;

public class SalesController {
	
	
 public String showPage() {
	 System.out.println("show Page method");
 return "ajay";
 }
 public static void main(String[] args) {
	 SalesController s=new  SalesController();
	 s.showPage();
}
}
