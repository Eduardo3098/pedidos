package com.app.pedidos.repositories;

import com.app.pedidos.entities.Pedido;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido, Long> {
    @Query(
            value = "SELECT p FROM Pedido p WHERE p.fecha BETWEEN :start AND :end"
    )
    List<Pedido> searchByDates(@Param("start") Date start,@Param("end") Date end);
}
