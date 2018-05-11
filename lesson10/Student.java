public class Student {
    String name;
    int[] tens;

    public Student(String name,int x,int y,int z){
        this.name = name;
        this.tens = new int[]{x,y,z};
    }
    @Override
    public String toString(){
        String s = "[" + name;
        for(int i = 0;i < tens.length;i++){
            s += "," + tens[i];
        }
        s += "]";
        return s;
    }
    public int total(){
        int sum = 0;
        for(int i = 0;i < tens.length;i++){
            sum += tens[i];
        }
        return sum;
    }
}

