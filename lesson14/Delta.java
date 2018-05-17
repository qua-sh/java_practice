/* 
 * 問題14-2
 * 回答がDeltaクラスの定義のみで実用性がない／(^o^)＼
 */

class Alpha {
    void test0(){
    };
}

interface Beta {
    void test1();
}

interface Gamma {
    void test2();
}

public class Delta extends Alpha implements Beta, Gamma {
    @Override
    public void test0(){
        System.out.println("test0");
    }
    @Override
    public void test1(){
        System.out.println("test1");

    }
    @Override
    public void test2(){
        System.out.println("test2");
        
    }
    public void Delta(){

    }
    public static void main(String[] args){
        Delta d = new Delta();
        d.test0();
        d.test1();
        d.test2();
    }
}