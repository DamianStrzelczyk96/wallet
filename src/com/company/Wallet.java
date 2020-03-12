package com.company;

public abstract class Wallet {

    public abstract String getName();
    public  MoneyType moneyType;

    public abstract double addMoney(double money);
    public abstract double spendingMoney(double money);
    public abstract double amountOfMoney();
    public abstract MoneyType ExChangeTo$();
    public abstract MoneyType ExChangeToPLN();
    public abstract MoneyType ExChangeToEUR();




    @Override
    public String toString() {
        return "Wallet: " + getName() +
                "  saldo= " +  moneyType +
                '}';
    }
}
