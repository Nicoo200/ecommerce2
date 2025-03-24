package com.revisao.ecommerce.dto;

import java.time.Instant;

import com.revisao.ecommerce.entities.Pedido;
import com.revisao.ecommerce.entities.StatusDoPedido;

public class PedidoDTO {

    private Long id;
    private Instant momento;
    private StatusDoPedido StatusDoPedido;
    private Long clienteId;

    public  PedidoDTO(){

    }

    public PedidoDTO(Long id, Instant momento, com.revisao.ecommerce.entities.StatusDoPedido statusDoPedido, Long clienteId) {
        this.id = id;
        this.momento = momento;
        StatusDoPedido = statusDoPedido;
        this.clienteId = clienteId;
    }

    public PedidoDTO(Pedido entity) {
        id = entity.getId();
        momento = entity.getMomento();
        StatusDoPedido = entity.getStatus();
        clienteId = entity.getCliente().getId();
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getId() {
        return id;
    }

    public Instant getMomento() {
        return momento;
    }

    public StatusDoPedido getStatusDoPedido() {
        return StatusDoPedido;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }

    public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
        StatusDoPedido = statusDoPedido;
    }
}
