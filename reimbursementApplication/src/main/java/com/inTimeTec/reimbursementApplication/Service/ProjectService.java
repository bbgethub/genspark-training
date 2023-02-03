package com.inTimeTec.reimbursementApplication.Service;

import com.inTimeTec.reimbursementApplication.Entity.Employee;
import com.inTimeTec.reimbursementApplication.Entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getProjects();
    Project getProject(int projectID);
    Project addProject(Project project);
    Project updateProject(Project project);
    String deleteProject(int projectID);
}
