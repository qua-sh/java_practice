public class Rectangle {
    int width;
    int height;

    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString(){
        return "[" + width + "," + height + "]";
    }
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(123,45);
        System.out.println(rectangle);
    }
}

