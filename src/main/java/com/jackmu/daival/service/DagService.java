package com.jackmu.daival.service;

import com.jackmu.daival.domain.Dag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DagService {
    List<Dag> getAllDag();
    List<Dag> getDagsByCreator(String creator_name);
    List<Dag> getDagsByTheme(String theme);
    int addDag(Dag dag);
    int updateDag(Dag dag);
    int deleteDag(String id);
}
