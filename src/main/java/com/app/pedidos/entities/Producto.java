package com.app.pedidos.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto extends Base {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "stock")
    private Integer stock;
    @Column(name = "precio")
    private Double precio;
}
