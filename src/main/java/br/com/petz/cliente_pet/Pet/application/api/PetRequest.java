package br.com.petz.cliente_pet.Pet.application.api;

import br.com.petz.cliente_pet.Pet.domain.Porte;
import br.com.petz.cliente_pet.Pet.domain.SexoPet;
import br.com.petz.cliente_pet.Pet.domain.TipoPet;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class PetRequest {
    @NotBlank
    private String nomePet;
    @NotNull
    private TipoPet tipo;
    @NotNull
    private Porte porte;
    private String microchip;
    @NotBlank
    private String raca;
    @NotNull
    private SexoPet sexoPet;
    private String pelagemCor;
    @NotNull
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;


}
