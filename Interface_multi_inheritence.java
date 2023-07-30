class phone {
    void voicecall() {

    }

    void sms() {

    }

}

interface Camera {

    void click();

    void record();

}

interface player {
    void play();

    void pause();

    void stop();
}

class smartphone extends phone implements Camera, player {

    @Override
    public void play() {
        // TODO Auto-generated method stub
    System.err.println("Play music");
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        System.err.println("Pause music");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.err.println("stop music");
    }

    @Override
    public void click() {
        // TODO Auto-generated method stub
        System.out.println("take a photo");
    }

    @Override
    public void record() {
        // TODO Auto-generated method stub
        System.out.println("record video");

    }
}

public class Interface_multi_inheritence {
    public static void main(String args[]) {
        smartphone o = new smartphone();
        o.click();
        o.record();
        o.play();
        o.pause();
        o.stop();
    }
}
