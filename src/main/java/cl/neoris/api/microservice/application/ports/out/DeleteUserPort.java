package cl.neoris.api.microservice.application.ports.out;

public interface DeleteUserPort {

  Boolean deleteUser(String uuid);
}
