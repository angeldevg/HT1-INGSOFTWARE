
package gt.edu.umg.sistemas.is.InterfaceSegregationSolutionApp.Model;

public class GuatemalanPerson implements IEspanishLanguaje, IEngleshLanguaje {

    @Override
    public void speakespanish() {
    
        System.out.println("i am guatemalan and i speak spanich");
        
    }

    @Override
    public void speakenglish() {
        System.out.println("i am guatemalan and i speak spanich");
    }
    
    
    
    
    
}
