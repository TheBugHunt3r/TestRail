package models;


import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Project {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("is_completed")
    private boolean isCompleted;

}