/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;
import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.base.MediaPlayer;
public class Audio {
     private final MediaPlayer mediaPlayer;

    public Audio() {
        MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory();
        this.mediaPlayer = mediaPlayerFactory.mediaPlayers().newMediaPlayer();
    }

    public void playOgg(String soundUrl) {
        mediaPlayer.media().play(soundUrl);
    }

    public void stop() {
        mediaPlayer.controls().stop();
    }

    public void setVolume(int volume) {
        mediaPlayer.audio().setVolume(volume);
    }
    public int getVolume() {
        return mediaPlayer.audio().volume();
    }
}
