package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Wallet>ListaOsob = new ArrayList<>();
        Janusz janusz = new Janusz();
        System.out.println(janusz.moeny);
        System.out.println(janusz.addMoney(100));
        System.out.println(janusz.spendingMoney(200));
        System.out.println(janusz.moeny);
        System.out.println(janusz.getName());
        System.out.println(janusz);
        janusz.ExChangeTo$();
        System.out.println(janusz);
        janusz.ExChangeToEUR();
        System.out.println(janusz);
        janusz.ExChangeToEUR();
        System.out.println(janusz);
        janusz.ExChangeToPLN();
        System.out.println(janusz);

        System.out.println(ListaOsob);



	// write your code here
    }
}
