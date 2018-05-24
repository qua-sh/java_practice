//問題16-6
class ThreadTest1 extends Thread{

    String label = "no label";
    int sleep = 0;
    int loop = 0;

    ThreadTest1(String label,int sleep, int loop){
        this.label = label;
        this.sleep = sleep;
        this.loop = loop;
    }
    public static void main(String[] args){
        ThreadTest1 ct1 = new ThreadTest1("***",3000,10);
        ct1.start();
        ThreadTest1 ct2 = new ThreadTest1("=====",5000,10);
        ct2.start();
    }
    @Override
    public void run(){
        while(loop > 0){
            loop--;
            System.out.println(label);
            try{
                Thread.sleep(sleep);
            }catch(InterruptedException e){

            }
        }
    }
}