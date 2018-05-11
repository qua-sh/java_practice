public class StudentTest {
    public static void main(String[] args){
        Student[] data = {
            new Student("佐伯祐介", 65,90,100),
            new Student("郡司英樹", 82,73,64),
            new Student("黒田舞子", 72,31,42),
            new Student("石井小百合",100,95,99),
        };
        for(int i = 0;i < data.length;i++){
            System.out.println(data[i] + "\t-> " + data[i].total());
        }
    }
}

