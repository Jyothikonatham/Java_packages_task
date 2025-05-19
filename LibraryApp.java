package com.library.app;
import com.library.books.Library;
import com.library.staff.Librarian;
public class LibraryApp{
	public static void main(String[] args){
	Library lib = new Library();
	lib.setLibraryName("Academy");
	lib.setTotalBooks(20000);
	
	Librarian libr = new Librarian();
	libr.setLibrarianName("Prakash");
	libr.setyearsOfExperience(13);
	System.out.println();
	libr.showLibrarianInfo();
	}
}