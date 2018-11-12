package group.project.riskmanagementBE.model;

import org.springframework.data.annotation.Id;
import org.springframework.hateoas.ResourceSupport;

public class Project{
    @Id
    private String uid;
    private String projectName;
    private String description;

    public Project() { }

    public Project(String name) {
        this.projectName = name;
    }

    public Project(String name, String description) {
        this.projectName = name;
        this.description = description;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getProjectName()
    {
        return projectName;
    }

    public void setProjectName(String name) {
        this.projectName = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "Project[uid=%s, projectName='%s', description='%s']",
                uid, projectName, description);
    }
}
