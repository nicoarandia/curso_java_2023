package models.domain.users;

import lombok.Getter;
import lombok.Setter;
import models.domain.services.Servicio;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Cliente {

    private String nombre;

    private String apellido;

    private Integer razonSocial;

    private Integer cuit;

    private String email;

    private List<Servicio> servicios;

    public Cliente () {
        this.servicios= new ArrayList<>();
    }

    public List<Servicio> obtenerServicios(){

        List<Servicio> servicios = new ArrayList<Servicio>();
        for (Servicio servicio : servicios){
            servicios.add(servicio);
        }
        return servicios;
    }


}
