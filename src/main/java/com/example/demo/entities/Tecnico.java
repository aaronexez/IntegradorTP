package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String especialdad;

    @Column
    private Integer incidentesPendientes;

    @OneToMany(mappedBy = "tecnicoCalificado", cascade = CascadeType.ALL)
    private List<Incidente> incidentes;

    @OneToOne
    private Reporte reporte;

}