
class Book {
    String title;
    String author;
    int price;
    
    void displayBook() {
            System.out.println("title: " + title);
            System.out.println("author: " +author);
            System.out.println("price: " + price);
    }
}
public class main1 {
    public static void main(String[] args) {
            Book b1=new Book();
            Book b2=new Book();
            
            b1.title = "Atomic Habits";
            b1.author = "James Clear";
            b1.price = 499;
            
            b2.title = "The Alchemist";
            b2.author = "Paulo Coelho";
            b2.price = 350;
            
            System.out.println("\n=====library======\n");
            
            System.out.println("Book1");
            b1.displayBook();
            
            System.out.println("");
            
            System.out.println("Book2" );
            b2.displayBook();
            
        }
    }   
