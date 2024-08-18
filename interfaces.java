import javax.xml.namespace.QName;

public class interfaces {
    public static void main(String[] args) {
    Queen q=new Queen();
    q.moves();
    }
}
interface chessplayer{
    void moves();
}
class Queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left right diagonal(in all 4 direction)");
    }
}
class Rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,left right ");
    }
}
class King implements chessplayer{
    public void moves(){
        System.out.println("up,down,left right ");
    }
}