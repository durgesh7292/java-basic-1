import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number a");
        int a=sc.nextInt();
        System.out.println("enter number b");
        int b=sc.nextInt();
        System.out.println("enter operator6");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':System.out.println(a+b);
            break;
            case '_':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '%':System.out.println(a%b);
            break;
            default:System.out.println("wrong operator");
        }
    }
    
}
