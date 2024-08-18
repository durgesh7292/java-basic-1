public class cleatith {
    public static int clearith(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearith(10, 1));
    }
}
