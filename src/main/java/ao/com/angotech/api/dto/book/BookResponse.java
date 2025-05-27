package ao.com.angotech.api.dto.book;

import ao.com.angotech.domain.enuns.Status;

public record BookResponse(

        String id,
        String title,
        String isbn,
        String gender,
        Integer publicationYear,
        Integer availableQuantity,
        Status status
) {
}
