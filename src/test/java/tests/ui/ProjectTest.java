package tests.ui;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ProjectTest extends BaseTest {

    @Test
    public void checkCreateProject() {
        projectStep.isProjectCreated(user, password, "Star");
    }

    @Test
    public void checkDeleteProject() {
       projectStep.isProjectDeleted(user, password, "Star");
    }
}
