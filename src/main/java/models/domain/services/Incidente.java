package models.domain.services;

import lombok.Getter;
import lombok.Setter;
import models.domain.users.Cliente;
import models.domain.users.Tecnico;

import java.util.Date;

@Getter
@Setter

public class Incidente {

    private Date apertura;

    private String descripcion;

    private Date cierre;

    private TipoIncidente tipo;

    private Cliente cliente;

    private Servicio servicio;


}
