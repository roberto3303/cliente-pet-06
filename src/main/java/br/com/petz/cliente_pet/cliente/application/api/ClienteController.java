package br.com.petz.cliente_pet.cliente.application.api;

import br.com.petz.cliente_pet.cliente.application.service.ClienteService;
import br.com.petz.cliente_pet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {

    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteController - postCliente ");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.info("[finaliza] ClienteController - postCliente ");
        return clienteCriado;
    }

    @Override
    public List<ClienteListResponse> getTodosClientes() {
        log.info("[inicia] ClienteController - getTodosClientes");
        List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
        log.info("[finaliza] ClienteController - getTodosClientes");
        return clientes;
    }

    @Override
    public ClienteDetalhadoResponse getClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteController - getClienteAtravesId");
        log.info("[idCliente] {}", idCliente);
        ClienteDetalhadoResponse clienteDetalhadoResponse = clienteService.buscaClienteAtravesId(idCliente);
        log.info("[finaliza] ClienteController - getClienteAtravesId");
        return clienteDetalhadoResponse;
    }

    @Override
    public void deleteClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteController - deleteClienteAtravesId");
        log.info("[idCliente] {}", idCliente);
        clienteService.deletaClienteAtravesId(idCliente);
        log.info("[finaliza] ClienteController - deleteClienteAtravesId");
    }

    @Override
    public void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest) {
        log.info("[inicia] ClienteController - patchAlteraCliente");
        clienteService.alteraClienteAtravesId(idCliente, clienteAlteracaoRequest);
        log.info("[finaliza] ClienteController - patchAlteraCliente");
    }

}
