package models;

import generics.LibraryItem;

public class Book extends LibraryItem<Book> {
	public Book(int itemID, String title, String author) {
        super.setItemID(itemID);
        super.setTitle(title);
        super.setAuthor(author);
    }
}