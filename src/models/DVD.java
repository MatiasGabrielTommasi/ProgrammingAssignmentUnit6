package models;

import generics.LibraryItem;

public class DVD extends LibraryItem<DVD> {
	public DVD(int itemID, String title, String author) {
        super.setItemID(itemID);
        super.setTitle(title);
        super.setAuthor(author);
    }
}