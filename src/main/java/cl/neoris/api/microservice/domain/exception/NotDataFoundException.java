package cl.neoris.api.microservice.domain.exception;

public class NotDataFoundException extends RuntimeException{

  public NotDataFoundException(String message){
    super(message);
  }
}
