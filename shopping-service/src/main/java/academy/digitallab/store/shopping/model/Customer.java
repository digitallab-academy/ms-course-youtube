package academy.digitallab.store.shopping.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    private Long id;

    private String numberID;

    private String firstName;

    private String lastName;

    private String email;

    private String photoUrl;

    private Region region;

    private String state;
}
