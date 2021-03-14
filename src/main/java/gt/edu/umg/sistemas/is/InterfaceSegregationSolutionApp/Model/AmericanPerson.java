
package gt.edu.umg.sistemas.is.InterfaceSegregationSolutionApp.Model;

/**
 *
 * @author ANGEL
 */
public class AmericanPerson implements IEngleshLanguaje, IEspanishLanguaje{

    @Override
    public void speakenglish() {
    
        System.out.println("i am american and i speak englesh");
    }

    @Override
    public void speakespanish() {
        

        System.out.println("i am american an i speak en spanish");
    }
    
}
