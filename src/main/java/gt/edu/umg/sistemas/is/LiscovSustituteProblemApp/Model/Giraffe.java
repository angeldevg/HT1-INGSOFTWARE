
package gt.edu.umg.sistemas.is.LiscovSustituteProblemApp.Model;

public class Giraffe extends Animal{


    @Override
    public void eatmeat() throws Exception {
        throw new Exception("I am a Giraffe and I cannot eat meat I am not carnivorous animal");
    }

}
