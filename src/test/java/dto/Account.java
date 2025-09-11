package dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Account {
    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    private String company;
    private String country;
    private String expected_users;
    private String web_address;
}
