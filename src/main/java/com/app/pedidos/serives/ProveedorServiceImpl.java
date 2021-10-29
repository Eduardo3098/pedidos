package com.app.pedidos.serives;

import com.app.pedidos.entities.Proveedor;
import com.app.pedidos.repositories.BaseRepository;
import com.app.pedidos.repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorServiceImpl extends BaseServiceImpl<Proveedor, Long> implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public ProveedorServiceImpl(BaseRepository<Proveedor, Long> baseRepository) {
        super(baseRepository);
    }
}