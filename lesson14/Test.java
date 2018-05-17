
import java.awt.*;
import java.net.URL;
import java.net.MalformedURLException;
/* 
 * 問題14-3
 * 回答がインターフェイスの定義のみで実用性がない／(^o^)＼
 */

interface IconInfo {
    int ICON_16x16 = 1;
    int ICON_32x32 = 2;
    Image getIcon(int iconType);
}

public class Test implements IconInfo {
    @Override
    public Image getIcon(int iconType){
        URL url = null;
        try{
            url = new URL("http://s-dev6.dfarm.amsg2.com/img_sp/thumbnail/item/" + iconType + "_item_60x60.gif");
        }catch(MalformedURLException e){
            e.printStackTrace();
        }
        Image img = Toolkit.getDefaultToolkit().getImage(url);
        return img;
    }
    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t.getIcon(t.ICON_16x16));
        
    }
}