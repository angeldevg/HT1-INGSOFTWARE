package gt.edu.umg.sistemas.ingenieriasoftwar.ht1.singleresponsabiliyapp.controller;

import gt.edu.umg.sistemas.ingenieriasoftwar.ht1.singleresponsabiliyapp.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping("/mensaje")
    public void menssage() {

        Message message = new Message();

        message.GenerateTableAreas(23, 20);

    }

}
