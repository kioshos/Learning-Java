package Musically;

public class Violin extends MusicalInstrument {

   public Violin() {
       super("Violin");
   }
    @Override
    public void Sound() {
        System.out.println("*Violin Sound*");
    }

    @Override
    public void Description() {
        System.out.println("The violin is the soprano of the string family.");
    }

    @Override
    public void History() {
        System.out.println("The violin was first known in 16th-century Italy");
    }
}
