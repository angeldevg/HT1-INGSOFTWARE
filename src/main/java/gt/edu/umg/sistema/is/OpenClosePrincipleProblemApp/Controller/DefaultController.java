
package gt.edu.umg.sistema.is.OpenClosePrincipleProblemApp.Controller;

import gt.edu.umg.sistema.is.OpenClosePrincipleProblemApp.Model.Part;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping("/")
    public void autospear(){
        
        System.out.println("Parte: " + Part.ReplacePart("llantas"));
        System.out.println("Parte: " + Part.ReplacePart("aceite"));
        System.out.println("Parte: " + Part.ReplacePart("aceite de frenos"));
        System.out.println("parte: " + Part.ReplacePart("pintura"));
        System.out.println("parte: " + Part.ReplacePart("limpieza de motor"));
               

    }

}

