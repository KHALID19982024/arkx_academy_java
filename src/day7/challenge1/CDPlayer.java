package day7.challenge1;

class CDPlayer extends AudioPlayer
{
    @Override
    public void play()
    {
        System.out.println("play the CD file");
    }
    @Override
    public void pause()
    {
        System.out.println("pause the CD file");
    }
    @Override
    public void stop()
    {
        System.out.println("stop the CD file");
    }

}
