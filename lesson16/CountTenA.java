//問題16-5
class CountTenA extends Thread{

    public static void main(String[] args){
        CountTenA ct1 = new CountTenA();
        ct1.start();
        CountTenA ct2 = new CountTenA();
        ct2.start();
        CountTenA ct3 = new CountTenA();
        ct3.start();
    }
    @Override
    public void run(){
        for (int i= 0; i < 10; i++) {
            System.out.println(this.getName() + ":i = " + i);
        }
    }
}