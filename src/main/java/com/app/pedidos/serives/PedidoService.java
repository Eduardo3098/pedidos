package com.app.pedidos.serives;

import com.app.pedidos.entities.Pedido;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public interface PedidoService extends BaseService<Pedido, Long> {
    List<Pedido> searchByDates(Date start, Date end) throws Exception;
}
