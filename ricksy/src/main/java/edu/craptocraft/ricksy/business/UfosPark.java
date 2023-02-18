package edu.craptocraft.ricksy.business;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {

    private final Map<String, String> flota = new HashMap<String, String>();
    double fee;


    public UfosPark() {
    }

    public void dispatch(CreditCard card) {
        double costOvni = 500d;
        double cost = card.credit() - costOvni;

        for (String key : flota.keySet()) {
            if ( card.credit() >= costOvni && !flota.containsValue(card.number())) {
                if (flota.get(key) == null) {
                    card.setCredit(cost);
                    flota.replace(key, card.number());
                }
            }
        } 

    }



    public Map<String, String> getFlota() {
        return flota;
    }

    public double getFee() {
        return fee;
    }

    public void add(String ovni) {
        getFlota().putIfAbsent(ovni, null);
    }

    public String getUfoOf(String number) {

        String ufo = "";

        for (String key : flota.keySet()) {
            if (flota.get(key) == number) {
    
                ufo = key;
                return ufo;
            } else {
                ufo = null;
            }
        }
        
        return ufo;
    }

    @Override
    public String toString() {
        return getFlota().keySet().toString();
    }
    
}
