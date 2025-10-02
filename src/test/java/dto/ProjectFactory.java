package dto;

import com.github.javafaker.Faker;

public class ProjectFactory {

    public static String URL = "https://chat.deepseek.com/%id%";

    public static Project createProject() {
        Faker faker = new Faker();
        return Project.builder()
                .name(faker.name().title())
                .announcement(faker.animal().name())
                .defect_view_url(URL)
                .defect_add_url(URL)
                .reference_view_url(URL)
                .reference_add_url(URL)
                .build();
    }
}
