/* 問題19-16
 * arrayListの挙動をarrayで表現する
 */
public class MyStringArrayList {
    private static final int INITIAL_CAPACITY  = 4;
    private String[] ar;
    // 配列のサイズ
    private int sz;

    public MyStringArrayList(){
        ar = new String[INITIAL_CAPACITY];
    }
    public void add(String s){
        if(size() + 1 >= INITIAL_CAPACITY){
            String[] arOld = ar;
            ar = new String[size() * 2];
            for(int i = 0; i < arOld.length; i++){
                ar[i] = arOld[i];
            }
        }
        ar[size()] = s;
    }
    public String get(int n){
        String s = null;
        try{
            s = ar[n];
        }catch(IndexOutOfBoundsException e){
            s = "添字が不正です";
        }
        return s;
    }
    //配列に格納されている要素数を取得する
    public int size(){
        int objectCount = 0;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == null){
                break;
            }else{
                objectCount++;
            }
        }
        return objectCount;
    }
    public static void main(String[] args){
        MyStringArrayList m = new MyStringArrayList();
        m.add("ああああああ");
        m.add("ええええええ");
        m.add("おおおおおお");
        m.add("うううううう");
        m.add("eeeeee");
        m.add("aaaaaa");
        m.add("dddddd");
        m.add("ffffff");

        for(int i = 0; i < m.ar.length; i++){
            System.out.println(m.get(i));
        }
        System.out.println(m.get(100));
    }
}