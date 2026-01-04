package org.example.model;

public class Chocolate extends ProductForSale{
    private boolean hasHazelnut;
    public Chocolate(String type, double price, String description, boolean hasHazelnut){
        super(type,price,description);
        this.hasHazelnut=hasHazelnut;
    }
    @Override
    public void showDetails(){
        System.out.println("Type: " + getType() + ", Price: "+ getPrice() + ", Description: "+ getDescription() + ", Has Hazelnut: " + hasHazelnut);
    }
    }

