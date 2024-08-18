import java.util.Scanner;

public class armstr {
    public static void main(String[] args) {
        int num,rem,sum=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int temp=num;
        while(num>0){
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num c/10;
        }
        if(temp==sum){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
