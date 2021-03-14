
package gt.edu.umg.sistemas.is.InterfaceSegregationProblemApp.Controller;

import gt.edu.umg.sistemas.is.InterfaceSegregationProblemApp.Model.AmericanPerson;
import gt.edu.umg.sistemas.is.InterfaceSegregationProblemApp.Model.GuatemalanPerson;
import gt.edu.umg.sistemas.is.InterfaceSegregationProblemApp.Model.ItalianPerson;
import gt.edu.umg.sistemas.is.InterfaceSegregationProblemApp.Model.Speaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping("/")
    public void speak() throws Exception{
        
        //english
        Speaker.humanespeakenglish(new AmericanPerson());
        Speaker.humanespeakenglish(new GuatemalanPerson());
        Speaker.humanespeakenglish(new ItalianPerson());
        
        //spanish
        Speaker.humanpeakspanich(new AmericanPerson());
        Speaker.humanpeakspanich(new GuatemalanPerson());
        Speaker.humanpeakspanich(new ItalianPerson());
        
        
        
        
    }

}