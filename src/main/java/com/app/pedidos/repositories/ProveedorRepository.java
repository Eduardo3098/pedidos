package com.app.pedidos.repositories;

import com.app.pedidos.entities.Proveedor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends BaseRepository<Proveedor, Long> {
}
