package com.mmcoe.pojo;


public class Main {

    public static void main(String[] args) {

        BankService bank = new BankService();

        bank.transferMoney("Aniket", "Rahul", 5000);

        bank.transferMoney("Aniket", "Rahul", 150000);

        bank.transferMoney("Aniket", "Rahul", -1000);
    }
}
