//package com.pluralsight;
//
////Methods/tools
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Application {
//    Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        ArrayList<Product> products = getProducts();
//        System.out.println("We carry the following products: ");
//        for (int i = 0; i < products.size(); i++) {
//            Product p = products.get(i);
//            System.out.printf("id: %d %s - Price: $%.2f%n",
//                    p.getId(), p.getName(), p.getPrice());
//        }
////Data type (Class) varName : array name
//        for(Product p: products){
//            System.out.printf("id: %d %s - Price: $%.2f%n",
//                    p.getId(), p.getName(), p.getPrice());
//        }
//
//
//    }
//
//    public static ArrayList<Product> getProducts() {
//        ArrayList<Product> inventory = new ArrayList<Product>();
//        // this method loads product objects into inventory
//        // and its details are not shown
//        Product product1 = new Product(4567, "10' 2X4 (Grade B)", 9.99f);
//        Product product2 = new Product(1234, "Hammer", 19.49f);
//        Product product3 = new Product(2345, "Box of Nails", 9.29f);
//        Product product4 = new Product(3948, "Heavy Duty Gloves", 12.29f);
//        Product product5 = new Product(1284, "Duct Tape", 8.79f);
//
//        inventory.add(product1);
//        inventory.add(product2);
//        inventory.add(product3);
//        inventory.add(product4);
//        inventory.add(product5);
//
//        return inventory;
//    }
//
//
//}
//--------------------------------------------
package com.pluralsight;

//Methods/tools

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;


public class Application {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        ArrayList<Product> products = getProducts();
        System.out.println("We carry the following products: ");
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
//Data type (Class) varName : array name | The bottom is another way of writing the above code. Enabling the code below will cause products to be printed twice
//        for(Product p: products){
//            System.out.printf("id: %d %s - Price: $%.2f%n",
//                    p.getId(), p.getName(), p.getPrice());
//        }


    }

    public static ArrayList<Product> getProducts() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        // this method loads product objects into inventory
        // and its details are not shown
        Product product1 = new Product(4567, "10' 2X4 (Grade B)", 9.99f);
        Product product2 = new Product(1234, "Hammer", 19.49f);
        Product product3 = new Product(2345, "Box of Nails", 9.29f);
        Product product4 = new Product(3948, "Heavy Duty Gloves", 12.29f);
        Product product5 = new Product(1284, "Duct Tape", 8.79f);

        inventory.add(product1);
        inventory.add(product2);
        inventory.add(product3);
        inventory.add(product4);
        inventory.add(product5);

        return inventory;
    }


}
