public class binary1 {
    public static void bintodec(int binNUM){
        int mynum=binNUM;
        int pow=0;
        int decnum=0;
        while(binNUM>0){
            int lastdigit=binNUM%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binNUM=binNUM/10;
        }
        System.out.println("decimalof"+mynum+"="+decnum);
    }
    public static void main(String[] args) {
        bintodec(101);
    }
}
