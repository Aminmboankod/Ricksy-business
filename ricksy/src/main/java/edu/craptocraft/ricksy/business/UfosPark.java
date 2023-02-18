package edu.craptocraft.ricksy.business;

public class UfosPark {

    public void dispatch(CreditCard card) {
        double costOvni = 500d;
        double cost = card.getCredit() - costOvni;
        
        if ( card.getCredit() >= costOvni ) {
            card.setCredit(cost);
        }

    }
    
}
