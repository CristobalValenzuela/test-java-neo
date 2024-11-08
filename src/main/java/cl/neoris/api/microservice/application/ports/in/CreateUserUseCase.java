package cl.neoris.api.microservice.application.ports.in;

import cl.neoris.api.microservice.adapters.http.dto.UserDTO;
import cl.neoris.api.microservice.domain.model.UserRespondeDTO;

public interface CreateUserUseCase {
  UserRespondeDTO createUser(UserDTO userDTO);
}
