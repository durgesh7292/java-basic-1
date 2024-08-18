public class clearith {
    public static int clearithlast(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearithlast(15, 2));
    }
}
