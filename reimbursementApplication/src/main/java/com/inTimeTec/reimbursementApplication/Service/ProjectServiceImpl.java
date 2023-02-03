package com.inTimeTec.reimbursementApplication.Service;

import com.inTimeTec.reimbursementApplication.Dao.ProjectDao;
import com.inTimeTec.reimbursementApplication.Entity.Employee;
import com.inTimeTec.reimbursementApplication.Entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectDao projectDao;

    @Override
    public List<Project> getProjects() {
        return this.projectDao.findAll();
    }

    @Override
    public Project getProject(int projectID) {
        Optional<Project> p = this.projectDao.findById(projectID);
        Project proj = null;
        if(p.isPresent()) {
            proj = p.get();
        }
        else {
            throw new RuntimeException("Project not found for given ID :: " + projectID);
        }
        return proj;
    }

    @Override
    public Project addProject(Project project) {
        return this.projectDao.save(project);
    }

    @Override
    public Project updateProject(Project project) {
        return this.projectDao.save(project);
    }

    @Override
    public String deleteProject(int projectID) {
        this.projectDao.deleteById(projectID);
        return "Project deleted successfully";
    }
}
