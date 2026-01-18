import java.util.*;

public class armstrong {
    public static void main(String args[]){
        int n = 1634;
        int temp = n;
        int pow = 0;
        int sum = 0;
        while(n>0){
            pow++;
            n /=10;
        }
        n = temp;
        while(temp>0){
            sum += Math.pow(temp%10,pow);
            temp /=10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not armstrong");
        }
    }
}
