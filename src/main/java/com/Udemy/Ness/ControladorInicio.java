package com.Udemy.Ness;

import com.Udemy.Ness.domain.Persona;
import java.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @Slf4j es una libreria de lombok que sirve para meanejar el log 
@Slf4j
public class ControladorInicio {
    
    //Spring injecta instrucciones con esta anotacion
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var saludar = "Hola Mundo con thymeleaf";
        
        Persona persona =new Persona();
        persona.setNombre("Miguel");
        persona.setApellido("Hernandez");
        persona.setEmail("mhernandez@gmail.com");
        persona.setTelefono("1122334455");
        
        Persona persona2 =new Persona();
        persona2.setNombre("Abigail");
        persona2.setApellido("Sanchez");
        persona2.setEmail("asanchez@gmail.com");
        persona2.setTelefono("315281321");
        
//        List<Persona> personas = new ArrayList();
//        personas.add(persona);
//        personas.add(persona2);
        
        var personas = Arrays.asList(persona, persona2);
        //var personas = Arrays.asList();
        
        log.info("ejecutando el controlador Spring MVC ");
        model.addAttribute("mensaje", saludar);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("Persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
}
