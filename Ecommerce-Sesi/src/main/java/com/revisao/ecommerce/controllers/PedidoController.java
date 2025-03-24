package com.revisao.ecommerce.controllers;

import com.revisao.ecommerce.dto.PedidoDTO;
import com.revisao.ecommerce.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class PedidoController {


    @Autowired
    PedidoService pedidoService;

    @PostMapping(value = "/new")
    public ResponseEntity<PedidoDTO> insert(@RequestBody PedidoDTO dto){
        dto = pedidoService.inserir(dto);
        return ResponseEntity.ok(dto);
    }
}

