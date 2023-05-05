
package com.portfolio.candelaport.service;


import com.portfolio.candelaport.entity.Persona;
import com.portfolio.candelaport.repository.IPersona;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SPersona {

@Autowired

IPersona iPersona;



 public List<Persona> list(){
      return iPersona.findAll();
   }
 

public Persona getOne(Long id){
        Persona per = iPersona.findById(id).orElse(null);
        return per;
   }    


    


//este es el mio
public void save(Persona per) {
iPersona.save(per);
}
 
 

public void delete(Long id) {
iPersona.deleteById(id);
}

public void edit(Persona per){
        iPersona.save(per);
    }  

  
//agregué estos:



public Optional<Persona> getByName(String name){
         return iPersona.findByName(name);
     }


   public boolean existsById(Long id){
         return iPersona.existsById(id);
     }
     
     public boolean existsByNombre(String name){
         return iPersona.existsByName(name);
     }
  //este de abajo es el mio original
//public List<Persona> verPersonas() {
//List<Persona> listaPersonas = iPersona.findAll();
//return listaPersonas;
//}


 
 
 


//este lo agregué recien
//public Persona login(String email, String clave){
  //      List<Persona> personas = iPersona.findByEmailAndClave(email, clave);
 //       if (!personas.isEmpty()) {
  //          return personas.get(0);
   //     }
 //       return null;
  //  }
//


//este es el mio abajo
//public Persona buscarPersona(Long id) {
//Persona perso= iPersona.findById(id).orElse(null);
//return perso;
//}






}