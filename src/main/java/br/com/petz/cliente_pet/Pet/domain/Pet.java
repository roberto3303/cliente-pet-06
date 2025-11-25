package br.com.petz.cliente_pet.Pet.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idPet", updatable = false, unique = true, nullable = false)
    private UUID idPet;
    @NotBlank
    private String nomePet;
    @Enumerated(EnumType.STRING)
    private Porte porte;
    @Enumerated(EnumType.STRING)
    private TipoPet tipo;
    private String microchip;
    @NotBlank
    private String raca;
    @NotBlank
    @Enumerated(EnumType.STRING)
    private SexoPet sexoPet;
    private String pelagemCor;
    @NotNull
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;


    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    //        public Cliente(ClienteRequest clienteRequest) {
//            this.nomeCompleto = clienteRequest.getNomeCompleto();
//            this.email = clienteRequest.getEmail();
//            this.celular = clienteRequest.getCelular();
//            this.telefone = clienteRequest.getTelefone();
//            this.sexo = clienteRequest.getSexo();
//            this.dataNascimento = clienteRequest.getDataNascimento();
//            this.cpf = clienteRequest.getCpf();
//            this.aceitaTermos = clienteRequest.getAceitaTermos();
//            this.dataHoraDoCadastro = LocalDateTime.now();
//        }
//
//        public void altera(ClienteAlteracaoRequest clienteAlteracaoRequest) {
//            this.nomeCompleto = clienteAlteracaoRequest.getNomeCompleto();
//            this.celular = clienteAlteracaoRequest.getCelular();
//            this.telefone = clienteAlteracaoRequest.getTelefone();
//            this.sexo = clienteAlteracaoRequest.getSexo();
//            this.dataNascimento = clienteAlteracaoRequest.getDataNascimento();
//            this.aceitaTermos = clienteAlteracaoRequest.getAceitaTermos();
//            this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
//        }


}
