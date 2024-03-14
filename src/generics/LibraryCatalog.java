package generics;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog<T extends LibraryItem<?>> {
    private List<T> items;
    
    public LibraryCatalog() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        int highestId = 0;
        for (T existingItem : items) {
            if (existingItem.getItemID() > highestId) {
                highestId = existingItem.getItemID();
            }
        }

        int newId = highestId + 1;
        item.setItemID(newId);

        items.add(item);
        
        System.out.println("Item added successfully");
        displayCatalog();
    }

    public void removeItem(int itemId) {
    	for (T item : items) {
            if (item.getItemID() == itemId) {
                items.remove(item);
            	System.out.println("The item with id " + itemId + " was removed successfully.");
                return;
            }
        }

    	System.out.println("The item with id " + itemId + " does not exists.");
    }

    public void displayCatalog() {
        System.out.println("Current Catalog List:");
        for (T item : items) {
            System.out.println(item.getItemID() + " - " + item.getTitle() + " by " + item.getAuthor());
        }
    }
}