package br.com.petz.cliente_pet.Pet.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
public class PetController implements PetAPI {


    @Override
    public PetResponse postPet(PetRequest petRequest, UUID idCliente) {
        log.info("[inicia] PetController - postPet");
        log.info("[idCliente] {}", idCliente);
        log.info("[finaliza] PetController - postPet");
        return null;
    }
}
