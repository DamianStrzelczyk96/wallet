package com.company;

public class Janusz extends Wallet  {

public double moeny;

    public Janusz () {
        moneyType = MoneyType.PLN;
        moeny = 200.0;


    }


    @Override
    public double addMoney(double money) {
        return this.moeny=this.moeny+money;
    }

    @Override
    public double spendingMoney(double money) {
        return this.moeny=this.moeny-money;
    }

    @Override
    public double amountOfMoney() {
        return moeny;
    }

    @Override
    public String getName() {
        return "Janusz";
    }

    @Override
    public MoneyType ExChangeTo$() {
        if(moneyType==MoneyType.PLN){
            moeny=moeny/2.0;
        }
        else if(moneyType==MoneyType.EUR)
        {
            moeny=moeny*2.0;
        }
        return moneyType=MoneyType.$ ;
    }

    @Override
    public MoneyType ExChangeToPLN() {
        if(moneyType==MoneyType.EUR ){
            moeny=moeny*4.0;
        }
        else if(moneyType==MoneyType.$)
        {
            moeny=moeny*2.0;
        }
        return moneyType=MoneyType.PLN ;
    }

    @Override
    public MoneyType ExChangeToEUR() {
        if(moneyType==MoneyType.PLN){
            moeny=moeny/4.0;
        }
        else if(moneyType==MoneyType.$)
        {
            moeny=moeny/2.0;
        }
        return moneyType=MoneyType.EUR ;
    }

    @Override
    public String toString() {
        return "Janusz{" +
                "moeny=" + moeny + moneyType+
                '}';
    }

}
