package cl.neoris.api.microservice.application.ports.out;

import cl.neoris.api.microservice.domain.model.UserRespondeDTO;
import java.util.List;

public interface ListUsersPort {

  List<UserRespondeDTO> listUsers();
}
