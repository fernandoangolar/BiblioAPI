package ao.com.angotech.api.dto.user;

import java.sql.Timestamp;

public record UserResponse(

        String id,
        String name,
        String email,
        String phone,
        String address,
        Timestamp create
) {
}
