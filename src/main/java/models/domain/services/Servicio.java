package models.domain.services;

import lombok.Getter;
import lombok.Setter;
import models.domain.users.Cliente;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Servicio {

    private String nombre;

    private String tipo;

    private List<Cliente> clientes;

    public Servicio () {

        this.clientes= new ArrayList<>();
    }

}
