package com.oop.demo;

public class BMSApplication {
	public static void main(String[] args) {
		Book book;// reference or variable
		Book book1 = new Book("Learn Java", "Ram");// reference + object, Logical mistakes
		book1.setPrice(100.99f);
		book1.setStatus(STATUS.AVAILABLE);
		System.out.println(book1.getAuthor());
		
//		book1.author = "Shyam";//bad code because authoe is immutable
		new Book("Ramesh", "Learn python");// only object is created
		Book book2 = book1; // no object
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		System.out.println(book1 == book2); // reference equality check
//		book1.author = "Ram"; //bad code

	}
}
