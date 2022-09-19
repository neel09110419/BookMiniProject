package com.dao;



import java.util.List;

import com.service.Books;
import com.service.Books;

public interface IDAOBook {
	public List<Books> displayAll();
	public void insertBook(Books b);
    public void deleteBook(int id);
    public void exit();
    public void findById(int id);
    public void updateBook(int id, int price);

}
