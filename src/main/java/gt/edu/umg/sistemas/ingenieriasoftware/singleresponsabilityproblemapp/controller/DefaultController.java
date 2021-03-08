package gt.edu.umg.sistemas.ingenieriasoftware.singleresponsabilityproblemapp.controller;

import gt.edu.umg.sistemas.ingenieriasoftware.singleresponsabilityproblemapp.model.CalculatorArea;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping("/")
    public void menssage(){
        
        CalculatorArea area = new CalculatorArea();

        area.GenerateTableAreas(45,45);
        
               

    }

}
