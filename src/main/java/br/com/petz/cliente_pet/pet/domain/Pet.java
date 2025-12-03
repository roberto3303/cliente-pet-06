package br.com.petz.cliente_pet.pet.domain;

import br.com.petz.cliente_pet.pet.application.api.PetAlteracaoRequest;
import br.com.petz.cliente_pet.pet.application.api.PetRequest;
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
    @NotNull
    @Column(columnDefinition = "uuid", name = "idClienteTutor", nullable = false)
    private UUID idClienteTutor;
    @NotBlank
    private String nomePet;
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoPet tipo;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Porte porte;
    private String microchip;
    @NotBlank
    private String raca;
    @NotNull
    @Enumerated(EnumType.STRING)
    private SexoPet sexoPet;
    private String pelagemCor;
    @NotNull
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;


    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Pet(UUID idCliente, PetRequest petRequest) {
        this.idClienteTutor = idCliente;
        this.nomePet = petRequest.getNomePet();
        this.tipo = petRequest.getTipo();
        this.porte = petRequest.getPorte();
        this.microchip = petRequest.getMicrochip();
        this.raca = petRequest.getRaca();
        this.sexoPet = petRequest.getSexoPet();
        this.pelagemCor = petRequest.getPelagemCor();
        this.dataNascimento = petRequest.getDataNascimento();
        this.rga = petRequest.getRga();
        this.peso = petRequest.getPeso();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }

    public void altera(PetAlteracaoRequest petAlteracaoRequest) {
        this.nomePet = petAlteracaoRequest.getNomePet();
        this.tipo = petAlteracaoRequest.getTipo();
        this.porte = petAlteracaoRequest.getPorte();
        this.microchip = petAlteracaoRequest.getMicrochip();
        this.raca = petAlteracaoRequest.getRaca();
        this.sexoPet = petAlteracaoRequest.getSexoPet();
        this.pelagemCor = petAlteracaoRequest.getPelagemCor();
        this.dataNascimento = petAlteracaoRequest.getDataNascimento();
        this.rga = petAlteracaoRequest.getRga();
        this.peso = petAlteracaoRequest.getPeso();
        this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
    }
}
