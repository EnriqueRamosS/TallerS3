
package com.example.TallerSemana3.controller;



import com.example.TallerSemana3.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    @GetMapping("/formulario")
    public String showForm(Model model){
        model.addAttribute("usuario",new Usuario());
        return "formulario";
    }
    @PostMapping("/guardar")
    public String submitForm(@ModelAttribute Usuario user,Model model){
        model.addAttribute("usuario", user);
        return "resultado";
    }
}
