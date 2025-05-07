package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class NinjaController {

    private final NinjaRepository ninjaRepository;

    public NinjaController(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    @GetMapping("/ninjas/form")
    public String exibirFormulario(Model model) {
        model.addAttribute("ninja", new NinjaModel());
        return "formulario";
    }

    @PostMapping("/ninjas")
    public String adicionarNinja(NinjaModel ninja) {
        ninjaRepository.save(ninja);
        return "redirect:/ninjas";
    }

    @GetMapping("/ninjas")
    public String listarNinjas(Model model) {
        model.addAttribute("ninjas", ninjaRepository.findAll());
        return "lista";
    }
}