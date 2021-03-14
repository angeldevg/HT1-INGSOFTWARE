
package gt.edu.umg.sistemas.is.LiscovSustituteProblemApp.Controller;

import gt.edu.umg.sistemas.is.LiscovSustituteProblemApp.Model.AnimalCaretaker;
import gt.edu.umg.sistemas.is.LiscovSustituteProblemApp.Model.Giraffe;
import gt.edu.umg.sistemas.is.LiscovSustituteProblemApp.Model.Tiger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping("/")
    public void fedd() throws Exception{
  
        AnimalCaretaker.feedanimal(new Tiger());
        AnimalCaretaker.feedanimal(new Giraffe());
    }

}