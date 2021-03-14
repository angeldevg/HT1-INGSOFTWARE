package gt.edu.umg.sistemas.is.InterfaceSegregationProblemApp.Model;

public class Human implements IHumanLanguaje {

    @Override
    public void speak() {

        System.out.println("I can speak");
    }

    @Override
    public void speakenglish() throws Exception {

        System.out.println("I can speak english");
    }

    @Override
    public void speakespanish() throws Exception {

        System.out.println("I can speak espanish");
    }

    @Override
    public void speakitalian() throws Exception {
        System.out.println("I can speak italian");
        
    }
    

}
