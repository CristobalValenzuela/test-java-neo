package cl.neoris.api.microservice.adapters.persistence;

import cl.neoris.api.microservice.adapters.http.dto.UserDTO;
import cl.neoris.api.microservice.adapters.persistence.entities.UserEntity;
import cl.neoris.api.microservice.domain.model.UserRespondeDTO;
import java.util.UUID;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    componentModel = "spring"
)
public interface UserMapper {

  UserEntity toEntity(UserDTO userDTO);
  @Mapping(target = "id", expression = "java(getID(userEntity.getId()))")
  UserRespondeDTO toResponseDTO(UserEntity userEntity);

  default String getID(UUID uuid){
    if(uuid == null)
       return "";
    return uuid.toString();
  }
}
