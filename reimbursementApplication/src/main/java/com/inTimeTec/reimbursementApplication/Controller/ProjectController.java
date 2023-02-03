package com.inTimeTec.reimbursementApplication.Controller;

import com.inTimeTec.reimbursementApplication.Entity.Project;
import com.inTimeTec.reimbursementApplication.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    public String project()
    {
        return "<HTML><H1>Welcome to Manager Page</H1></HTML>";
    }

    @GetMapping("/project")
    public List<Project> getProject()
    {
        return this.projectService.getProjects();
    }

    @GetMapping("/project/{projectID}")
    public Project getProject(@PathVariable String mgrID)
    {
        return this.projectService.getProject(Integer.parseInt(mgrID));
    }

    @PostMapping("/project")
    public Project addProject(@RequestBody Project project)
    {
        return this.projectService.addProject(project);
    }

    @PutMapping("/project")

    public Project updateProject(@RequestBody Project project)
    {
        return this.projectService.updateProject(project);
    }

    @DeleteMapping("/project/{projectID}")
    public String deleteProject(@PathVariable String projectID)
    {
        return this.projectService.deleteProject(Integer.parseInt(projectID));
    }

}
