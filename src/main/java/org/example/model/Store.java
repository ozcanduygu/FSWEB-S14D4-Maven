package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] =new Chocolate("Sweets", 14.5, "Bitter", true);
        products[1] =new Coke("Drinks", 7.5, "Cold Beverage", 1.5);
        products[2] =new Bread("Bakery", 9.5, "Fresh Bread", "Whole Wheat");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}