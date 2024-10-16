package cl.neoris.api.microservice.application.ports.in;

import cl.neoris.api.microservice.domain.model.UserRespondeDTO;
import java.util.List;

public interface ListUsersUseCase {

  List<UserRespondeDTO> listUsers();

}
