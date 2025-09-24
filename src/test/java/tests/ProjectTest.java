package tests;

import dto.ui.Project;
import dto.ui.ProjectFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ProjectTest extends BaseTest {

    @Test
    public void checkCreateProject() {
        projectStep.isProjectCreated();
    }

    @Test
    public void checkDeleteProject() {
       projectStep.isProjectDeleted();
    }
}
