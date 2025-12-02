package br.com.petz.cliente_pet.pet.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/pet")
public interface PetAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PetResponse postPet(@Valid @RequestBody PetRequest petRequest,
                        @PathVariable UUID idCliente);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<PetClienteListResponse> getPetsDoClienteComId(@PathVariable UUID idCliente);

    @GetMapping(value = "/{idPet}")
    @ResponseStatus(HttpStatus.OK)
    PetClienteDetalhadoResponse getPetDoClienteComId(@PathVariable UUID idCliente,
                                                     @PathVariable UUID idPet);
}
