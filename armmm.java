import java.util.Scanner;

public class armmm {
    public static void main(String[] args) {
        int num,rem,temp,sum=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(num>0){
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
