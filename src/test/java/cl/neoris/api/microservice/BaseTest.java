package cl.neoris.api.microservice;

import cl.neoris.api.microservice.adapters.http.dto.PhoneDTO;
import cl.neoris.api.microservice.adapters.http.dto.UserDTO;
import cl.neoris.api.microservice.adapters.persistence.UserMapper;
import cl.neoris.api.microservice.adapters.persistence.UserMapperImpl;
import cl.neoris.api.microservice.adapters.persistence.entities.UserEntity;
import cl.neoris.api.microservice.domain.model.UserRespondeDTO;
import java.util.List;
import java.util.UUID;

public class BaseTest {

  public UserDTO getUserDTO(){
    PhoneDTO phoneDTO = PhoneDTO.builder()
        .cityCode(2)
        .countryCode(56)
        .number(987654231)
        .build();
    return UserDTO.builder()
        .email("prueba@pl.cl")
        .name("Prueba")
        .phones(List.of(phoneDTO))
        .password("password")
        .build();
  }

  public UserEntity getUserEntity(){
    UserMapper userMapper = new UserMapperImpl();
    return userMapper.toEntity(getUserDTO());
  }

  public UserRespondeDTO getUserRespondeDTO(){
    UserMapper userMapper = new UserMapperImpl();
    UserEntity userEntity = getUserEntity();
    userEntity.setId(UUID.randomUUID());
    return userMapper.toResponseDTO(userEntity);
  }
}
