package day7.challenge1;

abstract class AudioPlayer implements Playable
{
    private int volume;

    public void increaseV()
    {
        volume+=3;
        System.out.println("volume actuel: "+volume);
    }
    public void decreaseV()
    {
        volume-=3;
        System.out.println("volume actuel: "+volume);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
