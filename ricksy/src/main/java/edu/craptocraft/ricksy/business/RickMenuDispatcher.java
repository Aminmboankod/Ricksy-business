package edu.craptocraft.ricksy.business;

import java.util.ArrayList;
import java.util.List;

public class RickMenuDispatcher implements GuestDispatcher{

    Double stock = 100d;
    Double price = 10d;
    List<String> clients = new ArrayList<>();

    public RickMenuDispatcher() {
    }

    @Override
    public void dispatch(CreditCard card) {
        if (getStock()>0 && card.credit()>0) {
            card.setCredit(card.credit()- price);
            setStock(getStock()-1);
            getClients().add(card.getOwner());
        }
        
        
    }

    public List<String> getClients(){
        return this.clients;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "stock: " + getStock() + "\n"+ getClients().toString();
    }
    
}
