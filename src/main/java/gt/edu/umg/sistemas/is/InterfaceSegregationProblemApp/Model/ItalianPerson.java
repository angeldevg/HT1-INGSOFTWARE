
package gt.edu.umg.sistemas.is.InterfaceSegregationProblemApp.Model;


public class ItalianPerson extends Human{
    
    
    @Override
    public void speakenglish() throws Exception {

        System.out.println("I am italian and i cannot speak english");
    }

    @Override
    public void speakespanish() throws Exception {

        System.out.println("I am italian and i cannot speak espanish");
    }

    @Override
    public void speakitalian(){
        System.out.println("I am italian and i can speak italian");
        
    }
    
}
