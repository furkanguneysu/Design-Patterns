package Structural.Adapter;

public class test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Boom boom pow.mp3");
        audioPlayer.play("mp4", "far far away.mp4");
        audioPlayer.play("Vlc", "mind me.vlc");
        audioPlayer.play("divx", "the platform.divx");
    }
}