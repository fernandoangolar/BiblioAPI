package ao.com.angotech.api.dto.user;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

public record UserRequest(

        @NotBlank(message = "Name cannot be empty")
        String name,

        @NotBlank(message = "Email cannot be empty")
        @Email(message = "Email invalid")
        String email,

        @NotBlank(message = "Phone cannot be empty")
        @Pattern(regexp = "^(\\+244)?\\s?(9\\d{8}|2\\d{8})$", message = "phone invalid. Exemplo: +244923456789")
        String phone,

        @NotBlank(message = "address cannot be empty")
        String address
) {
}
