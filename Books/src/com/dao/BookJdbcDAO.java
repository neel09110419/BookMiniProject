package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.service.Books;

public class BookJdbcDAO implements IDAOBook {

	@Override
	public List<Books> displayAll() {
		
		List<Books> books=new ArrayList<>();
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","@Manh");
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery("select * from books");
			while(r.next()) {
				books.add(new Books(r.getInt(1),r.getString(2),r.getInt(3),r.getString(4)));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public void insertBook(Books b) {
		
		try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","@Manh");
		PreparedStatement st=con.prepareStatement("insert into books values(?,?,?,?)");
		int id=b.getBookId();
		String title=b.getTitle();
		int price=b.getPrice();
		String author=b.getAuthor();
		
		st.setInt(1,id);
		st.setString(2,title);
		st.setInt(3, price);
		st.setString(4, author);
		
		int row=st.executeUpdate();
		if(row==1)
			System.out.println("row added");
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
}

	@Override
	public void deleteBook(int id) {
		
	
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","@Manh");
			PreparedStatement st=con.prepareStatement("delete from books where id=?");
			st.setInt(1,id);
			int row=st.executeUpdate();
			if(row==1)
				System.out.println("row deleted");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void exit() {
		
		System.exit(0);
	}

	@Override
	public void findById(int id) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","@Manh");
			PreparedStatement st=con.prepareStatement("select * from books where id=?");
			st.setInt(1,id);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				System.out.println("id= "+ rs.getInt(1)+" "+"title: "+rs.getString(2)+" "+"price: "+rs.getInt(3)+" "+"author: "+rs.getString(4));
			}
			
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}

	@Override
	public void updateBook(int id, int price) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","@Manh");
			PreparedStatement st=con.prepareStatement("update books set price=? where id=?");
			st.setInt(1,price);
			st.setInt(2, id);
			int row=st.executeUpdate();
			if(row==1)
				System.out.println("price updated");
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
}
		

