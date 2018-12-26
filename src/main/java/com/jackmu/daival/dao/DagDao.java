package com.jackmu.daival.dao;

import com.jackmu.daival.domain.Dag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface DagDao {

    List<Dag> getAllDag();
    List<Dag> getDagsByCreator(@Param(value = "creator") String creator_name);
    List<Dag> getDagsByTheme(@Param(value = "theme") String theme);
    int addDag(Dag dag);
    int updateDag(Dag dag);
    int deleteDag(@Param(value = "id") String id);
}
