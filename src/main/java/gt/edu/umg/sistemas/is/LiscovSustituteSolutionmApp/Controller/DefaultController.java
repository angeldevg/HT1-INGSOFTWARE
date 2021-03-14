
package gt.edu.umg.sistemas.is.LiscovSustituteSolutionmApp.Controller;


import gt.edu.umg.sistemas.is.LiscovSustituteSolutionmApp.Model.Animal;
import gt.edu.umg.sistemas.is.LiscovSustituteSolutionmApp.Model.AnimalCaretaker;
import gt.edu.umg.sistemas.is.LiscovSustituteSolutionmApp.Model.Giraffe;
import gt.edu.umg.sistemas.is.LiscovSustituteSolutionmApp.Model.Tiger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping("/")
    public void fedd() throws Exception{
  
        AnimalCaretaker.feedanimal(new Animal());
        AnimalCaretaker.feedanimal(new Tiger());
        AnimalCaretaker.feedanimal(new Giraffe());
    }

}