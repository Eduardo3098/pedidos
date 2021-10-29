package com.app.pedidos.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="pedido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido extends Base {

    @Column(name = "fecha")
    private Date fecha;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_proveedor")
    private Proveedor proveedor;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "pedido_detalle",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "detalle_id")
    )
    private List<Detalle> detalleList = new ArrayList<>();

}