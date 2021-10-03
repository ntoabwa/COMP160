/* Application class for Book*/

public class BookShopApp {
  
  public static void main (String[] args) {
    Book book1 = new Book();
    Book book2 = new Book();
    Book book3 = new Book();
    
    book1.displayBook();
    book2.displayBook();
    book3.displayBook();
        
    
    book1.setTitle("Life of Pi");
    book1.setPages(348);
    book1.setPrice(28.90);
    
    book2.setTitle("Mister Pip");
    book2.setPages(240);
    book2.setPrice(22.70);
    
    book3.setTitle("Java Book");
    book3.setPages(300);
    book3.setPrice(30.50);
    
    book1.displayBook();
    book2.displayBook();
    book3.displayBook();
        
    
  }  
} 
    