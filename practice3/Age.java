//年齢の平均をもとめる
import java.io.*;
public class Age {
    public static void main(String[] args){
        System.out.println("あなたの名前を入力してください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line1 = reader.readLine();
            System.out.println("あなたの年齢を入力してください。");
            String inputAge1 = reader.readLine();
            int age1 = Integer.parseInt(inputAge1);

            System.out.println("友人の名前を入力してください。");
            String line2 = reader.readLine();
            System.out.println("友人の年齢を入力してください。");
            String inputAge2 = reader.readLine();
            int age2 = Integer.parseInt(inputAge2);
            System.out.println(line1 + "さんと" + line2 + "さんの年齢の平均は" + (age1 + age2) / 2 + "歳です。");
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println("年齢は数値で入力してください。");
        }
    }
}