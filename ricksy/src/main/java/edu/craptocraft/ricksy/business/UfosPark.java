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
        double cost = card.getCredit() - costOvni;

        if ( card.getCredit() >= costOvni ) {
            card.setCredit(cost);
        }

    }



    public Map<String, String> getFlota() {
        return flota;
    }

    public void add(String ovni) {
        getFlota().putIfAbsent(ovni, null);
    }
    
}
