
package com.example.TallerSemana3.controller;

import com.example.TallerSemana3.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoController {
    @GetMapping("/formulario_empleado")
    public String showForm(Model model){
        model.addAttribute("empleado",new Empleado());
        return "formulario_empleado";
    }
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Empleado user,Model model){
        model.addAttribute("empleado", user);
        model.addAttribute("tarifaPorHora", user.calcularTarifaPorHora());
        model.addAttribute("sueldoTotal", user.calcularSueldoTotal());
        return "resultado_empleado";
    }
}
