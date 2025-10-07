package tests.api;

import org.testng.annotations.Test;

import static adapters.ProjectAPI.createProject;
import static adapters.ProjectAPI.deleteProject;

public class ProjectTest {

    @Test
    public void CreatingOfProjectTest() {
        createProject();
    }

    @Test
    public void DeletingOfProjectTest() {
        deleteProject("48");
    }
}
