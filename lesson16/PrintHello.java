//問題16-2 16-3
class LabelPrinter extends Thread{
    String label = "no label";

    LabelPrinter(String label){
        this.label = label;
    }
    @Override
    public void run(){
        while(true){
            System.out.println(label);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
        }
    }
}
public class PrintHello {
    public static void main(String[] args){
        LabelPrinter th1 = new LabelPrinter("おはよう！");
        th1.start();
        LabelPrinter th2 = new LabelPrinter("こんにちは！");
        th2.start();
        LabelPrinter th3 = new LabelPrinter("こんばんは！");
        th3.start();
    }
}

