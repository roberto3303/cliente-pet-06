package br.com.petz.cliente_pet.Pet.application.service;

import br.com.petz.cliente_pet.Pet.application.api.PetRequest;
import br.com.petz.cliente_pet.Pet.application.api.PetResponse;

import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, PetRequest petRequest);
}
