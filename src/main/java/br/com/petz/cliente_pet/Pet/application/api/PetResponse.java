package br.com.petz.cliente_pet.Pet.application.api;

import lombok.Value;

import java.util.UUID;

@Value
public class PetResponse {
    private UUID idPet;
}
