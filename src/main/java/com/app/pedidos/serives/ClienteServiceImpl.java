package com.app.pedidos.serives;

import com.app.pedidos.entities.Cliente;
import com.app.pedidos.repositories.BaseRepository;
import com.app.pedidos.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository) {
        super(baseRepository);
    }
}