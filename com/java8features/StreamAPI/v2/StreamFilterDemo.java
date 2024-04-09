package com.java8features.StreamAPI.v2;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterDemo {
    public static void main(String[] args) {

//        System.out.println("Traditional way to filter the products from list (without streamAPI)");
//        List<Products> list = new ArrayList<Products>();
//        for (Products p : getProducts()) {
//            if(p.getPrice() > 599.0f) {
//                list.add(p);
//            }
//        }
        /* Display the list */
//        for (Products p : list) {
//            System.out.println(p);
//        }

        System.out.println("Use StreamAPI for filtering");
        List<Products> list2 = getProducts()
                                .stream()
                                .filter((p) -> p.getPrice()>599.0f)
                                .toList();
        /* Display the List */
        list2.forEach(System.out::println);
    }

    private static List<Products> getProducts() {
        List<Products> productList = new ArrayList<>();
        productList.add(new Products(1,"HP Laptop", 1500.0f));
        productList.add(new Products(2,"Dell Laptop", 2590.0f));
        productList.add(new Products(3,"Lenovo Laptop", 1599.0f));
        productList.add(new Products(4,"Sony Laptop", 599.0f));
        productList.add(new Products(5,"Apple Laptop", 3500.0f));
        return productList;
    }
}

class Products {
    private int id;
    private String name;
    private final float price;

    public Products(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", price: " + price +
                ']';
    }
}