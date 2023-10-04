package www.java.paymoney.main;

import java.util.Scanner;

import www.java.paymoney.service.PayMoneyService;
import www.java.paymoney.service.PayMoneyServiceImpl;

public class PayMoneyApp {
    public static void main(String[] args){
    	PayMoneyService paymoney=new PayMoneyServiceImpl();
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the values of the array:");
		for(int i=0;i<size;i++){
		array[i]=sc.nextInt();
		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		int numberOfTarget=sc.nextInt();
		
		for(int i=0;i<numberOfTarget;i++){
			System.out.println("enter the value of target");
			int target=sc.nextInt();
		paymoney.checkTargetAcheived(size, array, target);
    }
    }
}
