package com.ui;

import java.util.Scanner;

import com.dao.BookJdbcDAO;
import com.service.Books;

public class Admin {

	public static void main(String[] args) {
		/*
		BookJdbcDAO obj = new BookJdbcDAO();
		obj.showMenu();
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1: obj.displayAll();
		        break;
		case 2: System.out.println("Enter book id :");
			    int bid = sc.nextInt();
			    System.out.println("Enter book title: ");
			    String t = sc.next();
			    System.out.println("Enter book price : ");
			    int p = sc.nextInt();
			    System.out.println("Enter book author : ");
			    String a = sc.next();
			    Books b1 = new Books(bid, t, p, a);
			    obj.insertBook(b1);
			    break;
		case 3: System.out.println("Enter book id :");
	            int b = sc.nextInt();
	            obj.deleteBook(b);
	            break;
		case 4: System.out.println("Enter book id :");
	    		int b2 = sc.nextInt();
	    		int b3 = sc.nextInt();
	    		obj.updateBook(b2,b3);
	    		break;
		case 5: System.out.println("Enter book id :");
		        int b4 = sc.nextInt();
		        obj.findById(b4);
		        break;
		case 6: System.out.println("Exit");
	    		
	            
		        
		        
		
		}
		
		
		

	}*/
		
		
		
		Scanner sc=new Scanner(System.in);
		
		String ch="Y";
		while(ch.equals("Y")) {
			System.out.println("Menu");
			System.out.println("press 1 to display all books");
			System.out.println("press 2 to insert a book");
			System.out.println("press 3 to delete a book");
			System.out.println("press 4 to update a book");
			System.out.println("press 5 to find book by it's id");
			System.out.println("press 6 to exit");
			System.out.println("please enter your choice: ");
			int n=sc.nextInt();
			BookJdbcDAO obj=new BookJdbcDAO();
			switch(n) {
			case 1:
				//obj.displayAll();
				System.out.println(obj.displayAll());
				
				break;
			case 2:
				System.out.println("enter book id");
				int id=sc.nextInt();
				System.out.println("enter book title");
				String title=sc.next();
				
				System.out.println("enter book price");
				int price=sc.nextInt();
				System.out.println("enter book author");
				String author=sc.next();
				Books obj1=new Books(id,title,price,author);
				obj.insertBook(obj1);
			    break;
			case 3:
				System.out.println("enter book id");
				int id1=sc.nextInt();
				obj.deleteBook(id1);
						break;
			case 4:
				System.out.println("enter book id");
				int id3=sc.nextInt();
				System.out.println("enter updated book price");
				int price1=sc.nextInt();
				obj.updateBook(id3, price1);
				break;
			case 5:
				System.out.println("enter book id");
				int id4=sc.nextInt();
				obj.findById(id4);
				break;
			case 6:
				System.exit(0);
				break;
			}
			System.out.println("press Y for menu");
			String str=sc.next();
			ch=str;
			
					
		}
		sc.close();
	}


}
