
package gt.edu.umg.sistemas.is.InterfaceSegregationSolutionApp.Controller;

import gt.edu.umg.sistemas.is.InterfaceSegregationSolutionApp.Model.AmericanPerson;
import gt.edu.umg.sistemas.is.InterfaceSegregationSolutionApp.Model.GuatemalanPerson;
import gt.edu.umg.sistemas.is.InterfaceSegregationSolutionApp.Model.IItalianLanguaje;
import gt.edu.umg.sistemas.is.InterfaceSegregationSolutionApp.Model.Spakear;
import javax.swing.text.StyledEditorKit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping("/")
    public void speak() throws Exception{
        
        //english
        Spakear.humanespeakenglish(new AmericanPerson());
        
        Spakear.humanpeakspanich(new GuatemalanPerson());
        
        
    }

}