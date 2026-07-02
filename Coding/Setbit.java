
import java.util.Scanner;

public class Setbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            sum = sum + n%2;
            n = n/2;
        }
        System.out.println(sum);
    }
    

}