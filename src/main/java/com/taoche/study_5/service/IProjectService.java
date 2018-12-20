package com.taoche.study_5.service;

import com.taoche.study_5.model.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface IProjectService {


    List<Project> findProjectAll();

}
