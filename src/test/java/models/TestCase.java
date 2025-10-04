package models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestCase {
    private String title;
    private String custom_preconds;

    public TestCase(String title, String custom_preconds) {
        this.title = title;
        this.custom_preconds = custom_preconds;
    }

}