//問題16-7
class ThreadTest2 implements Runnable{

    String label = "no label";
    int sleep = 0;
    int loop = 0;

    ThreadTest2(String label,int sleep, int loop){
        this.label = label;
        this.sleep = sleep;
        this.loop = loop;
    }
    public static void main(String[] args){
        ThreadTest2 ct1 = new ThreadTest2("***",3000,10);
        Thread th1 = new Thread(ct1);
        th1.start();
        ThreadTest2 ct2 = new ThreadTest2("=====",5000,10);
        Thread th2 = new Thread(ct2);
        th2.start();
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