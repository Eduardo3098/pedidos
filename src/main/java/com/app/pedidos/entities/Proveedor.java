package com.app.pedidos.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "proveedor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor extends Base{
    @Column(name = "identificacion", length = 13)
    private String identificacion;
    @Column(name = "razonSocial")
    private String razonSocial;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "proveedor_producto",
            joinColumns = @JoinColumn(name = "proveedor_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<Producto> productoList = new ArrayList<>();
}
