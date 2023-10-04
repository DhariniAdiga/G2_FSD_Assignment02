package www.java.paymoney.service;

public class PayMoneyServiceImpl implements PayMoneyService {
  public void checkTargetAcheived(int size,int[] arr,int target){
	  int sum=0;
	  int count=0;
		  for(int a:arr){
			  sum=sum+a;
			  count++;
			  if(sum>=target){
				  System.out.println("Target achieved after "+count+" transactions");
				  break;
			  }
		  }
		     while(sum<target){
			  System.out.println("Given target is not achieved");
			  break;
		     }
	  }
	  
  }       

