package Musically;

public abstract class MusicalInstrument {
    protected String name;
    public MusicalInstrument(String name) {
        this.name = name;
    }

    public abstract void Sound();
    public void ShowName(){
        System.out.println("Musical Instrument: " + name);
    }

    public abstract void Description();

    public abstract void History();
}
