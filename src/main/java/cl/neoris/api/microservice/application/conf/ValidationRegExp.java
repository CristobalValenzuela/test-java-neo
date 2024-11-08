package cl.neoris.api.microservice.application.conf;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@Configuration
public class ValidationRegExp {

  @Value("${app.validation.email-regex}")
  private String emailRegexValue;

  @Value("${app.validation.password-regex}")
  private String passwordRegexValue;

}
