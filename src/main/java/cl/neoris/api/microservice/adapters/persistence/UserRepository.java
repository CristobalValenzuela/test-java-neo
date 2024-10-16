package cl.neoris.api.microservice.adapters.persistence;

import cl.neoris.api.microservice.adapters.persistence.entities.UserEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

}
