package Musically;

public class Cello extends MusicalInstrument {
    public Cello() {
        super("Cello");
    }
    @Override
    public void Sound() {
        System.out.println("*Sounds of Cello*");
    }

    @Override
    public void Description() {
        System.out.println("A bass instrument of the violin family, held upright on the floor between the legs of the seated player.");
    }

    @Override
    public void History() {
        System.out.println("The cello came to the limelight for the first time in northern Italy in 1550.");
    }
}
