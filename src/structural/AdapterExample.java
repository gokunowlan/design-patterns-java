package structural;


interface MediaPlayer {
    void play(String fileType, String fileName);
}

class AudioPlayer implements MediaPlayer {
    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3: " + fileName);
        } else {
            MediaAdapter adapter = new MediaAdapter(fileType);
            adapter.play(fileType, fileName);
        }
    }
}

class MediaAdapter implements MediaPlayer {
    AdvancedPlayer advancedPlayer;

    MediaAdapter(String type) {
        if (type.equalsIgnoreCase("vlc")) {
            advancedPlayer = new VlcPlayer();
        }
    }

    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("vlc")) {
            advancedPlayer.playVlc(fileName);
        }
    }
}

interface AdvancedPlayer {
    void playVlc(String fileName);
}

class VlcPlayer implements AdvancedPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
}

public class AdapterExample {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "song.mp3");
        player.play("vlc", "video.vlc");
    }
}

