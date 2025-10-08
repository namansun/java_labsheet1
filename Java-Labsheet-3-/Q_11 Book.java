
class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = b1; 

        b2.title = "Python";

        System.out.println("b1 title: " + b1.title); 
        System.out.println("b2 title: " + b2.title); 
    }
}
