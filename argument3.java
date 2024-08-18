public class argument3 {
    public static void upadete(int marks[] ){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        upadete(marks);
        for(int i=0;i<marks.length;i++){
           System.out.print(marks[i]+"");
        }
        System.out.println();
    }
    
}
