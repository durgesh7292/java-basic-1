public class factat {
    public static int factorail(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(factorail(4));
    }
}