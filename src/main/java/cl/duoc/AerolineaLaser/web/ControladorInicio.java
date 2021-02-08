
package cl.duoc.AerolineaLaser.web;

import cl.duoc.AerolineaLaser.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired    
    private UsuarioService usuarioService;
       
    @GetMapping("/")
    public String index(Model modelo){
       var usuarios = usuarioService.listarUsuarios();      
  
       modelo.addAttribute("usuarios",usuarios);
       return "index";
       
    }
    
    @GetMapping("/login")
    public String login(Model modelo){
       var usuarios = usuarioService.listarUsuarios();      
  
       modelo.addAttribute("usuarios",usuarios);
       return "login";
       
    }
    
     @GetMapping("/servicioPremium")
    public String servicioPremium(Model modelo){
       var usuarios = usuarioService.listarUsuarios();      
  
       modelo.addAttribute("usuarios",usuarios);
       return "servicioPremium";
       
    }
    @GetMapping("/servicioTurismo")
    public String servicioTurismo(Model modelo){
       var usuarios = usuarioService.listarUsuarios();      
  
       modelo.addAttribute("usuarios",usuarios);
       return "servicioTurismo";
       
    }
    
    @GetMapping("/logout")
    public String logout(Model modelo){
       var usuarios = usuarioService.listarUsuarios();      
  
       modelo.addAttribute("usuarios",usuarios);
       return "logout";
       
    }
}
    

