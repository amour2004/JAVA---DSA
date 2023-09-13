public class intefaces {
        public static void main(String args[]){
        chessPlayer q = new queen();
        q.moves();

        bear b1 = new bear();

        b1.eat();

        }
}
interface chessPlayer{
        void moves();
    }

class queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all for dir.)");
    }
}

class rook implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

interface herb{
    void walk();
}

interface carn{
    void eat();
}

class bear implements herb,carn{
    public void walk(){
        System.out.println("walks");
    }
    public void eat(){
        System.out.println("eats");
    }
}