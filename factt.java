import java.util.Scanner;

public class factt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextint();
         int fact=1;
         for(int i=1;i<=num;i++){
            fact=fact*i;
         }
         System.out.println("factorial is"+"fact");
    }
}
