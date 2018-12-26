package com.jackmu.daival.service;

import com.jackmu.daival.dao.DagDao;
import com.jackmu.daival.domain.Dag;
import com.jackmu.daival.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service("DagService")
public class DagServiceImpl implements DagService {
    @Autowired
    private DagDao dagDao;
    @Override
    public List<Dag> getAllDag() {
        return dagDao.getAllDag();
    }

    @Override
    public List<Dag> getDagsByCreator(String creator_name) {
        if(StringUtils.isEmpty(creator_name))
            return null;
        return dagDao.getDagsByCreator(creator_name);
    }

    @Override
    public List<Dag> getDagsByTheme(String theme) {
        if (StringUtils.isEmpty(theme))
            return null;
        return dagDao.getDagsByTheme(theme);
    }

    @Override
    public int addDag(Dag dag) {
        if(dag != null){
            dag.setDag_no(dag.getTheme()+"_"+UUID.randomUUID().toString().substring(0,11));
            dag.setCreator_name(UserUtils.getUser().getUsername());
            dag.setStatus("成功");
        }
        int dag1 = dagDao.addDag(dag);
        return dag1;
    }

    @Override
    public int updateDag(Dag dag) {
        if(dag != null){
           dagDao.updateDag(dag);
        }
        return 0;
    }

    @Override
    public int deleteDag(String id) {
        if(StringUtils.isEmpty(id)){
            dagDao.deleteDag(id);
        }
        return 0;
    }
}
