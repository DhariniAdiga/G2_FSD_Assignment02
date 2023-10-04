package www.java.currency.service;

public class CurrencyServiceImpl implements CurrencyService{
    public void calculateDenominations(int[] den,int amount){
        //sort in descending order
        int temp=0,mul=1,count=0;
        for(int i=0;i<den.length;i++){
            for(int j=0;j<den.length;j++){
                if(den[i]>den[j]){
                    temp=den[i];
                    den[i]=den[j];
                    den[j]=temp;
                }
            }
        }
        for(int n:den){
            for(int i=1;i<=amount/n;i++){
                if(amount>=n){
                    count=amount/n;
                    amount=amount%n;
                }
                System.out.println(n+" : "+count);
                count=0;
            }


        }


    }
}
