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
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "reporte")
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    @OneToOne
    @JoinColumn(name = "incidente_id")
    private Incidente incidente;
}
