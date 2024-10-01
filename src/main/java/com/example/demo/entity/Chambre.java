package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idC;
    private String numC;
@Enumerated(EnumType.STRING)
    private TypeChambre typeC ;

   @OneToMany

    private Set<Reservation> reservations;

   @ManyToOne
   private Bloc bloc;

}
