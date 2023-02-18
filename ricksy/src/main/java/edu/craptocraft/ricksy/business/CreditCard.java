package edu.craptocraft.ricksy.business;

public class CreditCard {

    private final String owner;
    private final String number;
    private Double credit = 3000d;
    private String SYMBOL = "EZI";
    
    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public String getNumber() {
        return number;
    }

    public Double getCredit() {
        return credit;
    }

    public String getSYMBOL() {
        return SYMBOL;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public void setSYMBOL(String sYMBOL) {
        SYMBOL = sYMBOL;
    }

    @Override
    public String toString() {
        return "owner: " + getOwner() + "\nnumber: " + getNumber() + "\ncredit: " + getCredit() + SYMBOL;
    }


    
}

