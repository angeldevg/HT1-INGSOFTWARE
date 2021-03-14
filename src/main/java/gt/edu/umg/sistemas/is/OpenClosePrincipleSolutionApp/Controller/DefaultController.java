
package gt.edu.umg.sistemas.is.OpenClosePrincipleSolutionApp.Controller;

import gt.edu.umg.sistemas.is.OpenClosePrincipleSolutionApp.Model.BreaksReplace;
import gt.edu.umg.sistemas.is.OpenClosePrincipleSolutionApp.Model.CarburetorReplace;
import gt.edu.umg.sistemas.is.OpenClosePrincipleSolutionApp.Model.PaintReplace;
import gt.edu.umg.sistemas.is.OpenClosePrincipleSolutionApp.Model.Replacement;
import gt.edu.umg.sistemas.is.OpenClosePrincipleSolutionApp.Model.TireReplace;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping("/")
    public void autospear(){  
        
        System.out.println("Parte: " + Replacement.Replace(new PaintReplace()));
        System.out.println("Parte: " + Replacement.Replace(new TireReplace()));
        System.out.println("Parte: " + Replacement.Replace(new CarburetorReplace()));
        System.out.println("Parte: " + Replacement.Replace(new BreaksReplace()));

    }   
}

