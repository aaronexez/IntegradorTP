package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @OneToOne(mappedBy = "servicio")
    @JoinColumn(name = "incidente_id")
    private Incidente incidente;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

}
