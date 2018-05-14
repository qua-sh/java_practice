public class Rectangle {

    int width;
    int height;

    Rectangle(){
        setSize(0,0);
    }
    Rectangle(int width,int height){
        setSize(width,height);
    }
    void setSize(int width,int height){
        this.width  = width;
        this.height = height;
    }
}

class PlaceRectangle extends Rectangle{

    int x;
    int y;

    PlaceRectangle(){
        setSize(0,0);
        setLocation(0,0);
    }
    PlaceRectangle(int x,int y){
        setSize(0,0);
        setLocation(x,y);
    }
    PlaceRectangle(int x,int y,int width,int height){
        setSize(width,height);
        setLocation(x,y);
        
    }

    void setLocation(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "[(" + x + "," + y +  ")["  + width + "," + height + "]]";
    }
    public static void main(String[] args){
        PlaceRectangle r1 = new PlaceRectangle(12,34,123,45);
        System.out.println(r1);
    }
}
