package edu.craptocraft.ricksy.business;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {

    private final Map<String, String> flota = new HashMap<String, String>();
    double fee;


    public UfosPark() {
    }

    public void dispatch(CreditCard card) {
        double costOvni = 500d;
        double cost = card.credit() - costOvni;

        if ( (card.credit() >= costOvni) && (!flota.containsValue(card.number()))) {
            card.setCredit(cost);
            for (String key : flota.keySet()) {
                if (flota.get(key) == null) {
                    flota.replace(key, card.number());
                }
            } 
        } else {
            System.out.println("Ya tiene un ovni");
        }
        
    }



    public Map<String, String> getFlota() {
        return flota;
    }

    public void add(String ovni) {
        getFlota().putIfAbsent(ovni, null);
    }

    public String getUfoOf(String number) {

        String ufo = null;

        for (String key : flota.keySet()) {
            if (flota.get(key) == number) {
    
                ufo = key;
            }
    
        }
        
        return ufo;
    }
}
