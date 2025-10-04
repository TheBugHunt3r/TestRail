package adapters;

import adapters.base.BaseAdapters;

public class ProjectAdapters extends BaseAdapters {

    private static final String DELETE_PROJECT_ENDPOINT = "index.php?/api/v2/delete_project/%s";

    public static String deletes(String projectName) {
        String delete = String.format(DELETE_PROJECT_ENDPOINT, projectName);
        return delete;
    }
}
