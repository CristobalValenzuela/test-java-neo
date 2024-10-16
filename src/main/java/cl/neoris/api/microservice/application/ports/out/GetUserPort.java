package cl.neoris.api.microservice.application.ports.out;

import cl.neoris.api.microservice.domain.model.UserRespondeDTO;

public interface GetUserPort {

  UserRespondeDTO getUser(String uuid);
}
