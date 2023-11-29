package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String descripcionProblema;
    @Column
    private String tipoProblema;
    @Column(name = "fecha estimada")
    private Date fechaResolucion;
    @Enumerated(EnumType.STRING)
    private EstadoIncidente estadoIncidente;
    @ManyToOne
    @JoinColumn(name = "tecnicoCalificado_id")
    private Tecnico tecnicoCalificado;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "operador_id")
    private Operador operador;
}
