package dev.beatrizsouza.CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")

    public String boasvindas(){
        return "Boas vindas";
    }

}
