public class dectobin {
    public static void decto(int n){
        int mynum=n;
        int pow=0;
        int binNum=0;
        while(n>0){
            int rem=n%2;
            binNum=binNum*(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binry from of"+mynum+"="+binNum);
    }
    public static void main(String[] args) {
        decto(17);
    }
}
