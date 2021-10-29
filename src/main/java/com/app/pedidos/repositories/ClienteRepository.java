package com.app.pedidos.repositories;

import com.app.pedidos.entities.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long> {

}