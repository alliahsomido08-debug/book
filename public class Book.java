public class Book {

    String title;
    String author;
    int pages;

    // Constructor
    public Book(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
    }

    // Display method
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println();
    }

    public static void main(String[] args) {

        Book b1 = new Book("1984", "George Orwell", 328);
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book b3 = new Book("Sunrise", "Jeanin M.", 290);

        // Call display() on all books
        b1.display();
        b2.display();
        b3.display();
    }
}