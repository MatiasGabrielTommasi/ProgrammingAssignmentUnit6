package models;

import generics.LibraryItem;

public class CD extends LibraryItem<CD> {
	public CD(int itemID, String title, String author) {
        super.setItemID(itemID);
        super.setTitle(title);
        super.setAuthor(author);
    }
}