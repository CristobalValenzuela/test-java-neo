package cl.neoris.api.microservice.application.ports.out;

import cl.neoris.api.microservice.adapters.http.dto.UserDTO;
import cl.neoris.api.microservice.domain.model.UserRespondeDTO;

public interface SaveUserPort {

  UserRespondeDTO createUser(UserDTO userDTO, String token);
}
