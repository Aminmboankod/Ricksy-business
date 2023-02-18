package edu.craptocraft.ricksy.business;

public class CrystalExpender implements GuestDispatcher {

    private Integer stock;
    private Double itemCost;



    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }



    public Integer stock() {
        return stock;
    }



    public double getItemCost() {
        return itemCost;
    }



    public void setStock(Integer stock) {
        this.stock = stock;
    }



    @Override
    public String toString() {
        return "stock: " + stock() + "\nitemCost: " + getItemCost();
    }



    public void dispatch(CreditCard card) {
        
        if (card.credit() >= getItemCost() && stock() > 0) {
            card.setCredit(card.credit()-getItemCost());
            setStock(stock()-1);
        }
    }


}

