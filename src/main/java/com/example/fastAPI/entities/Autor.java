package com.example.fastAPI.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name="autor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Autor extends Base{
    private String nombre;
    private String apellido;
    private String biografia;
}
