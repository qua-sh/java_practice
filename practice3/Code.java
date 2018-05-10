//年齢の平均をもとめる
import java.io.*;
public class Code {
    public static void main(String[] args){
        System.out.println("文字を入力してください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line1 = reader.readLine();
            for(int i = 0; i < line1.length(); i++){
                System.out.println(line1.charAt(i) + "の文字コードは" + (int)line1.charAt(i) + "です。");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}