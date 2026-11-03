package dev.beatrizsouza.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")

    public String boasvindas(){
        return "Boas vindas";
    }

}
