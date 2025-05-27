package ao.com.angotech.api.dto.book;

import ao.com.angotech.domain.enuns.Status;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BookRequest(

        @NotBlank(message = "title cannot be empty")
        String title,

        @NotBlank(message = "title cannot be empty")
        String isbn,

        @NotBlank(message = "gender cannot be empty")
        String gender,

        @NotNull(message = "Publication year cannot be empty")
        @Min(1450)  // Primeiro livro impresso conhecido (Gutenberg)
        @Max(2025)  // Limite superior futuro
        Integer publicationYear,

        @NotNull(message = "Available Quantity cannot be empty")
        @Min(0)
        Integer availableQuantity,

        @NotNull(message = "status is required.")
        Status status
) {
}
