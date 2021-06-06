package interfaces;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product {
  int id;
  String name;
  float price;

  public Product(int id, String name, float price) {
    super();
    this.id = id;
    this.name = name;
    this.price = price;
  }
}

public class LambdaExpressionDemo {
  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();

    /*productList.add(new Product(1, "HP Laptop", 25000f));
    productList.add(new Product(3, "Keyboard", 300f));
    productList.add(new Product(2, "Dell Mouse", 150f));

    System.out.println("Sorting on the basis of name...");

    Collections.sort(productList, (p1, p2) -> {
      return p1.name.compareTo(p2.name);
    });

    productList.forEach(product -> System.out.println(product.id + "-" + product.name + "-" + product.price));*/

    /*list.add(new Product(1,"Samsung A5",17000f));
    list.add(new Product(3,"Iphone 6S",65000f));
    list.add(new Product(2,"Sony Xperia",25000f));
    list.add(new Product(4,"Nokia Lumia",15000f));
    list.add(new Product(5,"Redmi4 ",26000f));
    list.add(new Product(6,"Lenevo Vibe",19000f));

    Stream<Product> filteredStream = list.stream().filter(p -> p.price>20000);
    filteredStream.forEach(product -> System.out.println(product.id+":"+product.name+":"+ product.price));*/

    JTextField textField = new JTextField();
    textField.setBounds(50,50,150,20);
    JButton button = new JButton("click");
    button.setBounds(80,1000,70,30);

    button.addActionListener(e -> {
      textField.setText("Hello Swing");
    });

    JFrame frame = new JFrame();
    frame.add(textField);
    frame.add(button);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(300,200);
    frame.setVisible(true);
  }
}
