package designpatterns.prototype;

public class BookMain {
  public static void main(String[] args) throws CloneNotSupportedException{
    BookShop bookShop = new BookShop();
    bookShop.setShopName("Novelty");
    bookShop.loadData();
    bookShop.getBooks().remove(2);
    System.out.println(bookShop);

    BookShop bookShop1 = (BookShop) bookShop.clone();
    bookShop1.setShopName("A1");
    System.out.println(bookShop1);


  }
}
