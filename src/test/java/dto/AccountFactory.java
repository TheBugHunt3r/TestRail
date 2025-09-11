package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public static Account getAccount(String country, String expected_users) {
        Faker faker = new Faker();
        return Account.builder()
                .first_name(faker.name().name())
                .last_name(faker.name().lastName())
                .email(faker.internet().emailAddress())
                .phone(faker.phoneNumber().phoneNumber())
                .company(faker.company().name())
                .build();
    }
}
