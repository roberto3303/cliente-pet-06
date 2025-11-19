package br.com.petz.cliente_pet.cliente.application.api;

import br.com.petz.cliente_pet.cliente.domain.Cliente;
import br.com.petz.cliente_pet.cliente.domain.Sexo;
import lombok.Value;


import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private String celular;
    private String cpf;
    private Sexo sexo;
    private Boolean aceitaTermos;
    private String telefone;

    private LocalDateTime dataHoraDoCadastro;

    public ClienteDetalhadoResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
        this.cpf = cliente.getCpf();
        this.sexo = cliente.getSexo();
        this.aceitaTermos = cliente.getAceitaTermos();
        this.telefone = cliente.getTelefone();
        this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
    }

}
