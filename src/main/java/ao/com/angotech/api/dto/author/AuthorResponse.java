package ao.com.angotech.api.dto.author;
import java.time.LocalDate;

public record AuthorResponse(

        String id,
        String name,
        String nationality,
        LocalDate birthDate,
        String biography
) {
}
