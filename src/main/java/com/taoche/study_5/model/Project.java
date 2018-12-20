package com.taoche.study_5.model;

public class Project {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCreateDate() {
        return projectCreateDate;
    }

    public void setProjectCreateDate(String projectCreateDate) {
        this.projectCreateDate = projectCreateDate;
    }

    private Integer id;
    private String projectName;
    private String projectCreateDate;


}
