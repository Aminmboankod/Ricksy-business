package edu.craptocraft.ricksy.business;

import java.util.ArrayList;
import java.util.List;

public class Receptivo {
    
private List<GuestDispatcher> observers = new ArrayList<>();

    public Receptivo() {}

    public void registra(GuestDispatcher observer) {
        observers.add(observer);


    }

    public void dispatch(CreditCard card) {

        for (GuestDispatcher observer : observers) {
            observer.dispatch(card);
        }
        
    }

    public List<GuestDispatcher> getObservers() {
        return observers;
    }


    
}

