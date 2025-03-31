package Musically;

public class Trombone extends MusicalInstrument{
    public Trombone() {
        super("Trombone");
    }
    @Override
    public void Sound() {
        System.out.println("*Trombone sound*");
    }

    @Override
    public void Description() {
        System.out.println("The trombone is a musical instrument in the brass family.");
    }

    @Override
    public void History() {
    System.out.println("Trombone has been invented in Belgium around 1450");
    }
}
