package dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Project {
    private String name;
    private String announcement;
    private boolean show_the_announcement;
    private boolean test_case_approvals;
    private boolean multiple_suites_to_manage_cases;
    private boolean single_repository;
    private String default_access;
    private String defect_plugin;
    private String defect_view_url;
    private String defect_add_url;
    private String reference_plugin;
    private String reference_view_url;
    private String reference_add_url;
}
