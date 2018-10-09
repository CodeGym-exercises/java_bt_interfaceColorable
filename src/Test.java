public class Test {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(3,"Green");
        squares[1] = new Square(3);
        squares[2] = new Square(5,"red");

        for(Square square: squares){
            if(square.getColor()!=null){
                square.howToColor();
            }
        }
    }
}
