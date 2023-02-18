package edu.craptocraft.ricksy.business;

public class CrystalExpender {

    private Integer stock;
    private Double itemCost;



    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }



    public Integer getStock() {
        return stock;
    }



    public double getItemCost() {
        return itemCost;
    }



    @Override
    public String toString() {
        return "stock: " + getStock() + "\nitemCost: " + getItemCost();
    }


}

