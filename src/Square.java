public class Square implements Colorable {
    private double size;
    private String color;

    public Square(double size) {
        this.size = size;
    }

    public Square(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return this.size*this.size;
    }

    public double getPerimeter(){
        return this.size*4;
    }

    @Override
    public String toString(){
        return "Square\nSize: "+this.size+"\nArea: "+this.getArea()+"\nPerimeter: "+this.getPerimeter()+"";
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides. " + this.color);
    }
}
