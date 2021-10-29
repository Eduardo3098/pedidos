package com.app.pedidos.controllers;

import com.app.pedidos.entities.Pedido;
import com.app.pedidos.entities.RequestDate;
import com.app.pedidos.serives.PedidoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl> {
    @PostMapping("/searchByDates")
    public ResponseEntity<?> searchByDates(@RequestBody RequestDate dates) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchByDates(dates.getStart(), dates.getEnd()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": " + e.getMessage()+"\"}");
        }
    }
}