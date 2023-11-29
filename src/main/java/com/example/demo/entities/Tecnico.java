package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column
    private List<String> especialdades;
    @ElementCollection
    private Map<String,Integer> tiempoEstimado;
    @Column
    private Integer incidentesPendientes;
    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
    private List<Incidente> incidentes;
}
