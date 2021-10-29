package com.app.pedidos.serives;

import com.app.pedidos.entities.Pedido;
import com.app.pedidos.repositories.BaseRepository;
import com.app.pedidos.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Pedido> searchByDates(Date start, Date end) throws Exception {
        try {
            return pedidoRepository.searchByDates(start, end);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}