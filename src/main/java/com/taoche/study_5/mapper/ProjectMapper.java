package com.taoche.study_5.mapper;

import com.taoche.study_5.model.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {

    List<Project> findProjectAll();


}
