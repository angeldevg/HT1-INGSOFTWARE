
package gt.edu.umg.sistemas.is.InterfaceSegregationProblemApp.Model;


public class AmericanPerson extends Human{
    
        @Override
    public void speakenglish(){

        System.out.println("I am american and i can speak english");
    }

    @Override
    public void speakespanish() throws Exception {

        System.out.println("I am american and i cannot speak espanish");
    }

    @Override
    public void speakitalian() throws Exception {
        System.out.println("I am italian and i cannot speak italian");
        
    }
    
}
