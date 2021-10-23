/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.demoumg;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author Carrillo
 */
@Controller
@Slf4j
public class Controlador {
    @GetMapping("/")
    public String inicio(Model modelo){
        
        var msg = "Ventas de Empleados ";
        var persona = new Persona();
        persona.setNombreVendedor("Maria lopez");
        persona.setVentaenero("150");
        persona.setVentafebrero("982");
        persona.setVentamarzo("9845");
        
        var persona2 = new Persona();
         persona2.setNombreVendedor("Marta Julia");
        persona2.setVentaenero("9896");
        persona2.setVentafebrero("1024");
        persona2.setVentamarzo("69845");
        
        
        var persona3 = new Persona();
        persona3.setNombreVendedor("Maricela perez");
        persona3.setVentaenero("5632");
        persona3.setVentafebrero("198");
        persona3.setVentamarzo("2548");
  
        var personas = Arrays.asList(persona,persona2, persona3);
        
        modelo.addAttribute("msg",msg);
        modelo.addAttribute("personas",personas);
        return "index";
    }
    
   
}

