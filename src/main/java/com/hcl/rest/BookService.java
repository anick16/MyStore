package com.hcl.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.hcl.pojo.Book;

@Path("/books")
public class BookService {

	@GET
	public List<Book> getBooks() {
		Book book;
		List<Book> bookList = new ArrayList<Book>();
		book = new Book();
		book.setIsbn(12345);
		book.setPrice(200.50);
		book.setTitle("The Title Of The Book");
		bookList.add(book);
		return bookList;
	}
}
