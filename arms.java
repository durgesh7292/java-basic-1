import java.util.Scanner;

public class arms {
    public static void main(String[] args) {
        int num ,sum=0,rem,temp;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(num>0){
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
