import java.io. *;
//素数を出力する
//for文２回回してるの無駄なので改良した
public class Prime1 {
    private static final int MAX_PRIME = 1000;
    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("使用法:java Prime1 作成ファイル");
            System.out.println("例:java Prime1 Prime.txt");
            System.exit(0);
        }
        String filename = args[0];
        try{
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            writePrime(writer);
            writer.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void writePrime(PrintWriter writer){
        boolean[] prime = new boolean[MAX_PRIME];
        for(int n = 2; n < MAX_PRIME; n++){
            prime[n] = true;
            for(int m = 2; m < n; m++){
                if(n % m == 0){
                    prime[n] = false;
                    continue;
                }
            }
            if(prime[n]){
                // ここでnを出力する
                System.out.println(n);
            }
        }
    }
}

