package models.domain.users;

import lombok.Getter;
import lombok.Setter;
import models.domain.services.Especialidad;
import models.domain.services.Incidente;

import java.util.List;
import java.util.Set;


@Getter
@Setter

public class Tecnico {

    private String nombre;

    private Integer celular;

    private String email;

    private Incidente incidente;

    private String estado;

    private Set<Especialidad> especialidades;





}
