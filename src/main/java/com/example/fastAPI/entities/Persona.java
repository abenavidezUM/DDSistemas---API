package com.example.fastAPI.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name="persona")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Persona extends Base{
    private String nombre;
    private String apellido;
    private int dni;
}

