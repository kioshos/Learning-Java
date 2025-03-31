package Musically;

public class Ukulele extends MusicalInstrument{
    public Ukulele() {
        super("Ukulele");
    }
    @Override
    public void Sound() {
        System.out.println("*Ukulele sound*");
    }

    @Override
    public void Description() {
        System.out.println("A ukulele, also known as uke or ukelele, is a small stringed instrument that originated in Hawai'i.");
    }

    @Override
    public void History() {
     System.out.println("Ukulele has been introduced into Hawaii by the Portuguese in the 1870s");
    }
}
