package com.taoche.study_5.controller.project;

import com.taoche.study_5.model.Project;
import com.taoche.study_5.service.IProjectService;
import com.taoche.study_5.service.impl.ProjectServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/project")
public class ProjectController {

    private final static Logger logger = LoggerFactory.getLogger(ProjectController.class);

    private final IProjectService projectService;

    @Autowired
    public ProjectController(ProjectServiceImpl projectService) {
        this.projectService = projectService;
    }

    @RequestMapping("/list")
    public String list(Model model){

        List<Project> projectList = projectService.findProjectAll();
        model.addAttribute("projectList",projectList);
        return "project/list";
    }
}
