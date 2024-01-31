package day7.challenge1;

class MP3Player extends AudioPlayer
{
    @Override
    public void play()
    {
        System.out.println("play the MP3 file");
    }
    @Override
    public void pause()
    {
        System.out.println("pause the MP3 file");
    }
    @Override
    public void stop()
    {
        System.out.println("stop the MP3 file");
    }
}

