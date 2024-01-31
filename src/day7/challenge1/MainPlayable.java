package day7.challenge1;
class MainPlayable{
    public static void main(String[] args) {
        //mp3 files
        AudioPlayer mp3 = new MP3Player();
        mp3.setVolume(80);
        mp3.decreaseV();
        mp3.decreaseV();
        mp3.play();
        //CD files
        AudioPlayer cd = new CDPlayer();
        cd.setVolume(66);
        cd.increaseV();
        cd.increaseV();
        cd.pause();
        cd.stop();

        //libraryMusic
        MusicLibrary lib = new MusicLibrary();

        AudioPlayer picola = new MP3Player();
        AudioPlayer TP = new MP3Player();
        AudioPlayer WOW = new MP3Player();
        AudioPlayer Loveurself = new MP3Player();
        AudioPlayer LG = new MP3Player();

        lib.addTrack(picola);
        lib.addTrack(TP);
        lib.addTrack(WOW);
        lib.addTrack(Loveurself);
        lib.addTrack(LG);
        lib.playListe();
        lib.playTrack(2);
        lib.pauseTrack();
        lib.playTrack(5);
        lib.stopTrack();


    }
}