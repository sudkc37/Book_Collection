package Library;

public class Main {
    public static void main(String[] args) {
        Library<Book> bookLibrary = new Library<Book>();

        bookLibrary.addItem(new Book("On The Road", "Jack Kerouac", 2000, 2));
        bookLibrary.addItem(new Book("To Kill A Mockingbird","Harper Lee", 2012, 5 ));
        bookLibrary.addItem(new Book("Catch-22","Josheph Heller", 2018, 1 ));
        bookLibrary.addItem(new Book("The Great Gatsby","F.Scott Fitzerald", 2012, 5 ));
        bookLibrary.addItem(new Book("The Lord Of The Rings","J.R.R Tolkien", 2010, 5 ));
        bookLibrary.addItem(new Book("Lolita Vladimir","Nabokov", 2002, 3 ));
        bookLibrary.addItem(new Book("The Catcher in The Rye","JD Salinger", 2001, 1 ));
        bookLibrary.addItem(new Book("Midnight's Childeren","Salman", 2018, 5 ));
        bookLibrary.addItem(new Book("1984","George Orwell", 2021, 5 ));
        bookLibrary.addItem(new Book("Midnight's Childeren","Salman", 2018, 5 ));
        bookLibrary.addItem(new Book("Fahrenheit 451","Ray Brandbury", 2018, 5 ));
        bookLibrary.addItem(new Book("Starship","Robert A. Heinlein", 2011, 2 ));
        bookLibrary.addItem(new Book("The Man in The High Castle", "Philip K", 2020, 1));





        Library<Ebook> libraryEBook = new Library<Ebook>();
        libraryEBook.addItem(new Ebook("Lolita Vladimir","Nabokov", 2002, 3));
        libraryEBook.addItem(new Ebook("On The Road", "Jack Kerouac", 2000, 2));
        libraryEBook.addItem(new Ebook("To Kill A Mockingbird","Harper Lee", 2012, 5));
        libraryEBook.addItem(new Ebook("Catch-22","Josheph Heller", 2018, 1));
        libraryEBook.addItem(new Ebook("The Great Gatsby","F.Scott Fitzerald", 2012, 5));
        libraryEBook.addItem(new Ebook("The Lord Of The Rings","J.R.R Tolkien", 2010, 5));
        libraryEBook.addItem(new Ebook("Lolita Vladimir","Nabokov", 2002, 3));



        Library<PrintedBook> libraryPrintedBook = new Library<PrintedBook>();
        libraryPrintedBook.addItem(new PrintedBook("The Great Gatsby","F.Scott Fitzerald", 2012, 5*2, 0.5));
        libraryPrintedBook.addItem(new PrintedBook("Alice's Adventures In Wonderland","Lewis Carroll", 2012, 5*2, 0.6 ));
        libraryPrintedBook.addItem(new PrintedBook("The Lord Of The Rings","J.R.R Tolkien", 2010, 5*2,0.2));
        libraryPrintedBook.addItem(new PrintedBook("Lolita Vladimir","Nabokov", 2002, 3*5, 0.3 ));
        libraryPrintedBook.addItem(new PrintedBook("The Catcher in The Rye","JD Salinger", 2001, 5*2, 0.6 ));
        libraryPrintedBook.addItem(new PrintedBook("Midnight's Childeren","Salman", 2018, 5*2, 0.9 ));


        Library<eaudioBook> libraryeAudioBook = new Library<eaudioBook>();
        libraryeAudioBook.addItem(new eaudioBook("The Great Gatsby","F.Scott Fitzerald", 2012, 5, 12 ));
        libraryeAudioBook.addItem(new eaudioBook("The Lord Of The Rings","J.R.R Tolkien", 2010, 5, 2 ));
        libraryeAudioBook.addItem(new eaudioBook("Lolita Vladimir","Nabokov", 2002, 3, 8 ));


        Library<ScienceFictionBook> libraryScienceFictionBook = new Library<ScienceFictionBook>();
        libraryScienceFictionBook.addItem(new ScienceFictionBook("Fahrenheit 451","Ray Brandbury", 2018, 2*2,0.3,"Phys"));
        libraryScienceFictionBook.addItem(new ScienceFictionBook("Starship","Robert A. Heinlein", 2011, 2*6, 0.5,"Astro" ));
        libraryScienceFictionBook.addItem(new ScienceFictionBook("The Man in The High Castle", "Philip K", 2020, 3*6, 0.2, "Ferital"));




        System.out.println("Books Offered by Library");
        System.out.println(bookLibrary);


        System.out.println("\nEbooks offere by Library");
        System.out.println(libraryEBook);


        System.out.println("\nTypes of Printed Book");
        System.out.println(libraryPrintedBook);


        System.out.println("\nAudioEBook types");
        System.out.println(libraryeAudioBook);

        System.out.println("\nScienceFictionBook");
        System.out.println(libraryScienceFictionBook);

        System.out.println("Items :" +bookLibrary.getAvailableCount(bookLibrary));
        System.out.println("Items :" + libraryEBook.getAvailableCount(libraryEBook));
        System.out.println("Items :" +libraryPrintedBook.getAvailableCount(libraryPrintedBook));
        System.out.println( "Items :" +libraryScienceFictionBook.getAvailableCount(libraryScienceFictionBook));
        System.out.println("Items :" + libraryeAudioBook.getAvailableCount(libraryeAudioBook));












        System.out.println(bookLibrary);






    }
}
