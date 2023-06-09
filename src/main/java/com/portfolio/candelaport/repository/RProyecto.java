
package com.portfolio.candelaport.repository;

import com.portfolio.candelaport.entity.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RProyecto extends JpaRepository<Proyecto, Integer>{
    
      //toma la lista de los relojes por persona
    List<Proyecto> findByPersonaId(Long personaId);
  
}