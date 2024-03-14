package gui;

import java.util.Scanner;

import generics.LibraryCatalog;
import models.Book;
import models.CD;
import models.DVD;


public class MainUI {
    static Scanner scanner = new Scanner(System.in);
    static LibraryCatalog<CD> cdCatalog = new LibraryCatalog<CD>();
    static LibraryCatalog<DVD> dvdCatalog = new LibraryCatalog<DVD>();
    static LibraryCatalog<Book> bookCatalog = new LibraryCatalog<Book>();
    
    public static void main(String[] args) {
    	initializeCatalogs();
    	while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Work with CDs");
            System.out.println("2. Work with DVDs");
            System.out.println("3. Work with Libros");
            System.out.println("4. Close program");
            System.out.print("Please enter an option: ");
            int choice = scanner.nextInt();

        	System.out.print("\033[H\033[2J");
            System.out.flush();
            
            switch (choice) {
                case 1:
                    showCDCatalogMenu();
                    break;
                case 2:
                    showDVDCatalogMenu();
                    break;
                case 3:
                    showBookCatalogMenu();
                    break;
                case 4:
                    System.out.println("Thanks for using the system. ¡Have a great day!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option, please enter a valid option to proceed.");
            }
        }
    }
    private static int getLibraryItemOptions(String item) {
    	while (true) {
            System.out.println("********    " + item + "s    ********");
            System.out.println("1. Add " + item);
            System.out.println("2. Delete " + item);
            System.out.println("3. Show "  + item + "s Catalog");
            System.out.println("4. Back to Main Menu");
            System.out.print("Please enter an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

        	System.out.print("\033[H\033[2J");
            System.out.flush();
            
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return choice;
                default:
                    System.out.println("Invalid option, please enter a valid option to proceed.");
            }
        }
    }
    
    private static void showCDCatalogMenu() {
        while (true) {
            int choice = getLibraryItemOptions("CD");

        	System.out.print("\033[H\033[2J");
            System.out.flush();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    CD item = new CD(0, title, author);
                    cdCatalog.addItem(item);
                    break;
                case 2:
                	cdCatalog.displayCatalog();
                    System.out.print("Select CD to delete: ");
                    int id = scanner.nextInt();
                    cdCatalog.removeItem(id);
                    break;
                case 3:
                	cdCatalog.displayCatalog();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option, please enter a valid option to proceed.");
            }
        }
    }

    private static void showDVDCatalogMenu() {
        while (true) {
            int choice = getLibraryItemOptions("DVD");

        	System.out.print("\033[H\033[2J");
            System.out.flush();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    DVD item = new DVD(0, title, author);
                    dvdCatalog.addItem(item);
                    break;
                case 2:
                	cdCatalog.displayCatalog();
                    System.out.print("Select DVD to delete: ");
                    int id = scanner.nextInt();
                    dvdCatalog.removeItem(id);
                    break;
                case 3:
                	dvdCatalog.displayCatalog();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option, please enter a valid option to proceed.");
            }
        }
    }

    private static void showBookCatalogMenu() {
        while (true) {
            int choice = getLibraryItemOptions("Book");

        	System.out.print("\033[H\033[2J");
            System.out.flush();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    Book item = new Book(0, title, author);
                    bookCatalog.addItem(item);
                    break;
                case 2:
                	bookCatalog.displayCatalog();
                    System.out.print("Select Book to delete: ");
                    int id = scanner.nextInt();
                    bookCatalog.removeItem(id);
                    break;
                case 3:
                	bookCatalog.displayCatalog();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option, please enter a valid option to proceed.");
            }
            
        }
    }
    
    private static void initializeCatalogs() {
        dvdCatalog.addItem(new DVD(1, "The Shawshank Redemption", "Frank Darabont"));
        dvdCatalog.addItem(new DVD(2, "The Godfather", "Francis Ford Coppola"));
        dvdCatalog.addItem(new DVD(3, "The Dark Knight", "Christopher Nolan"));
        dvdCatalog.addItem(new DVD(4, "Pulp Fiction", "Quentin Tarantino"));
        dvdCatalog.addItem(new DVD(5, "Schindler's List", "Steven Spielberg"));
        dvdCatalog.addItem(new DVD(6, "Forrest Gump", "Robert Zemeckis"));
        dvdCatalog.addItem(new DVD(7, "Inception", "Christopher Nolan"));
        
        cdCatalog.addItem(new CD(1, "Thriller", "Michael Jackson"));
        cdCatalog.addItem(new CD(2, "Abbey Road", "The Beatles"));
        cdCatalog.addItem(new CD(3, "Back in Black", "AC/DC"));
        cdCatalog.addItem(new CD(4, "The Dark Side of the Moon", "Pink Floyd"));
        cdCatalog.addItem(new CD(5, "Led Zeppelin IV", "Led Zeppelin"));
        cdCatalog.addItem(new CD(6, "Hotel California", "Eagles"));
        cdCatalog.addItem(new CD(7, "Rumours", "Fleetwood Mac"));
        
        bookCatalog.addItem(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        bookCatalog.addItem(new Book(2, "1984", "George Orwell"));
        bookCatalog.addItem(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookCatalog.addItem(new Book(4, "The Catcher in the Rye", "J.D. Salinger"));
        bookCatalog.addItem(new Book(5, "The Hobbit", "J.R.R. Tolkien"));
        bookCatalog.addItem(new Book(6, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));
        bookCatalog.addItem(new Book(7, "The Chronicles of Narnia: The Lion, the Witch and the Wardrobe", "C.S. Lewis"));

    	System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}