package com.taoche.study_5.service.impl;

import com.taoche.study_5.mapper.ProjectMapper;
import com.taoche.study_5.model.Project;
import com.taoche.study_5.service.IProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements IProjectService {

    private final static Logger logger = LoggerFactory.getLogger(ProjectServiceImpl.class);
    private final ProjectMapper projectMapper;

    public ProjectServiceImpl(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    @Override
    public List<Project> findProjectAll() {

        return  projectMapper.findProjectAll();

    }
}
