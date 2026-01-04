package org.example.model;

public class Coke extends  ProductForSale{
    private double liter;
    public Coke(String type, double price, String description, double liter){
        super(type,price,description);
        this.liter=liter;
    }
    @Override
    public void showDetails(){
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() +
                ", Liter: " + liter);
    }
}
