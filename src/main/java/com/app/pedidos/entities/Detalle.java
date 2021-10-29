package com.app.pedidos.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="detalle")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Detalle extends Base {

    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "precioUnitario")
    private Double precioUnitario;
    @Column(name = "total")
    private Double total;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_producto")
    private Producto producto;
}