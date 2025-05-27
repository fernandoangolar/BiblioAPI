package ao.com.angotech.api.dto.author;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record AuthorRequest(

        @NotBlank(message = "Name is required")
        String name,

        @NotBlank(message = "Nationality is required")
        String nationality,

        @NotNull(message = "Birth date is required")
        @Past(message = "Birth date must be in the past")
        LocalDate birthDate,

        @NotBlank(message = "Biography is required")
        @Size(min = 10, max = 2000, message = "Biography must be between 10 and 2000 characters")
        String biography
) {
}
