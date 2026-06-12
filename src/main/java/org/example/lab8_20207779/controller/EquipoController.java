package org.example.lab8_20207779.controller;
import org.example.lab8_20207779.repository.EquipoRepository;
import java.util.List;

import javax.persistence.*;
import java.util.Date;


@Controller
public class EquipoController {

    final EquipoRepository equipoRepository;

    public EquipoController(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    @ResponseBody
    @GetMapping( "/equipo")
    public List<Equipo> listarEquipos(){
        return equipoRepository.findAll();
    }

}
