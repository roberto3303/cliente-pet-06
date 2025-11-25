package br.com.petz.cliente_pet.Pet.application.service;

import br.com.petz.cliente_pet.Pet.application.api.PetRequest;
import br.com.petz.cliente_pet.Pet.application.api.PetResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class PetApplicationService implements PetService {

    @Override
    public PetResponse criaPet(UUID idCliente, PetRequest petRequest) {
        log.info("[inicia] PetApplicationService - criaPet");
        log.info("[finaliza] PetApplicationService - criaPet");
        return null;
    }
}
