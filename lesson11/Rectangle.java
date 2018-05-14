public class Rectangle {
    final int INITIAL_WIDTH  = 10;
    final int INITIAL_HEIGHT = 10;
    final int INITIAL_X = 0;
    final int INITIAL_Y = 0;
    int width;
    int height;
    int x;
    int y;

    public Rectangle(){
        setLocation(INITIAL_X,INITIAL_Y);
        setSize(INITIAL_WIDTH,INITIAL_HEIGHT);
    }
    public Rectangle(int width,int height){
        setLocation(INITIAL_X,INITIAL_Y);
        setSize(width,height);
    }
    public Rectangle(int width,int height,int x,int y){
        setLocation(x,y);
        setSize(width,height);
    }

    public void setLocation(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void setSize(int width,int height){
        this.width  = width;
        this.height = height;
    }
    //四角と四角の重なり部分の座標と長さを求める
    public static Rectangle intersect(Rectangle r1, Rectangle r2){
        int startX;
        int startY;
        int endX;
        int endY;

        if(r1.x < r2.x){
            startX = r2.x;
            endX = r1.x + r1.width;
        }else{
            startX = r1.x;
            endX = r2.x + r2.width;
        }

        if(r1.y < r2.y){
            startY = r2.y;
            endY = r1.y + r1.height;
        }else{
            startY = r1.y;
            endY = r2.y + r2.height;
        }
        Rectangle r3 = new Rectangle(Math.abs(endX - startX),Math.abs(endY - startY),startX,startY);
        return r3;
    }
    @Override
    public String toString(){
        return "[x:" + x + ",y:" + y +  ",width:"  + width + ",height:" + height + "]";
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(123,45,40,21);
        Rectangle r2 = new Rectangle(10,20);
        Rectangle r3 = intersect(r1, r2);
        System.out.println(r3);
    }
}

