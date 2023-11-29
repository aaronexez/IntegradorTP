package com.example.demo.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Servicio {
    private Long id;
    private String nombre;
    private Incidente incidente;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

}
