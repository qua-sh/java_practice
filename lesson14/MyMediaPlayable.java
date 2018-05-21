/* 
 * 問題14-4
 */

interface MyMediaPlayable {
    void play();
    void stop();
    void loop();
}

interface MySoundPlayable extends MyMediaPlayable{
    String getSoundName();
}
