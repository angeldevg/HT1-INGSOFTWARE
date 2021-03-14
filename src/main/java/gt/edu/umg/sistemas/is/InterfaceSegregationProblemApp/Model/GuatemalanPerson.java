
package gt.edu.umg.sistemas.is.InterfaceSegregationProblemApp.Model;


public class GuatemalanPerson extends Human{
    
        @Override
    public void speakenglish() throws Exception {

        System.out.println("I am guatemalan and i cannot speak english");
    }

    @Override
    public void speakespanish(){

        System.out.println("I am guatemalan and i can speak espanish");
    }

    @Override
    public void speakitalian() throws Exception {
        System.out.println("I am guatemalan and i cannot speak italian");
        
    }
}
