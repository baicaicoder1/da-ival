package com.jackmu.daival.domain;

import java.util.Date;

public class Dag {
    private Integer id;
    private String dag_no;
    private String dag_name;
    private String timing;
    private String expect_end_time;
    private String theme;
    private String creator_name;
    private Date recently_exec;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDag_no() {
        return dag_no;
    }

    public void setDag_no(String dag_no) {
        this.dag_no = dag_no;
    }

    public String getDag_name() {
        return dag_name;
    }

    public void setDag_name(String dag_name) {
        this.dag_name = dag_name;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getExpect_end_time() {
        return expect_end_time;
    }

    public void setExpect_end_time(String expect_end_time) {
        this.expect_end_time = expect_end_time;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getCreator_name() {
        return creator_name;
    }

    public void setCreator_name(String creator_name) {
        this.creator_name = creator_name;
    }

    public Date getRecently_exec() {
        return recently_exec;
    }

    public void setRecently_exec(Date recently_exec) {
        this.recently_exec = recently_exec;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
