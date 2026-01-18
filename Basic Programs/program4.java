
public class program4 {
    public static void main(String args[]){
        System.out.println("Odd Numbers Sum: ");
        int sum = 0;
        for(int i=1;i<=100;i+=2){
            sum += i;
        }
        System.out.println(sum);
        System.out.println();
        System.out.println("Even Numbers Sum: ");
        sum = 0;
        for(int i=2;i<=100;i+=2){
            sum += i;
        }
        System.out.println(sum);
        System.out.println();
    }
}
