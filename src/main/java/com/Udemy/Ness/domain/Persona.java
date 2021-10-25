package com.Udemy.Ness.domain;

import lombok.Data;

//Lombok nos ayuda a crear POJOS o JAVAbeans
@Data
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
