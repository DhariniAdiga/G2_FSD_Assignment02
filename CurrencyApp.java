package www.java.currency.main;

import www.java.currency.service.CurrencyService;
import www.java.currency.service.CurrencyServiceImpl;

import java.util.Scanner;

public class CurrencyApp {
    public static void main(String[] args) {
        CurrencyService currency = new CurrencyServiceImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of currency denominations");
        int size=sc.nextInt();

        int[] array=new int[size];
        System.out.println("enter the currency denominations value");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter the amount you want to pay");
        int amount=sc.nextInt();
        currency.calculateDenominations(array,amount);

    }
}
