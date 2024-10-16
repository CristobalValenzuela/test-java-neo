package cl.neoris.api.microservice.application.ports.in;

import cl.neoris.api.microservice.domain.model.UserRespondeDTO;

public interface GetUserUseCase {

  UserRespondeDTO getUser(String uuid);
}
