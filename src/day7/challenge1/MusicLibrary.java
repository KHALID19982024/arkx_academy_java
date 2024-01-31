package day7.challenge1;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private List<AudioPlayer> Tracks;
    private AudioPlayer PlayingTrack;

    public MusicLibrary() {
        this.Tracks = new ArrayList<>();
    }

    public void addTrack(AudioPlayer trck) {
        Tracks.add(trck);
    }

    public void playTrack(int idx) {
        if (idx < Tracks.size() && idx >= 0) {
            PlayingTrack = Tracks.get(idx);
            PlayingTrack.play();
        }
    }

    public void pauseTrack() {
        if (PlayingTrack != null) {
            PlayingTrack.pause();
        }
    }

    public void stopTrack() {
        if (PlayingTrack != null)
        {
            PlayingTrack.stop();
            PlayingTrack = null;
        }
    }
    void playListe() {
        System.out.println("Tracks in the playlist:");
        for (int i = 1; i <= Tracks.size(); i++) {
            System.out.println("Track " + i);
        }
    }
}