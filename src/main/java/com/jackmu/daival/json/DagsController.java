package com.jackmu.daival.json;

import com.jackmu.daival.domain.Dag;
import com.jackmu.daival.service.DagService;
import com.jackmu.daival.utils.UserUtils;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class DagsController {

    @Autowired
    private DagService dagService;
    @RequestMapping("/dags")
    public String dags(Model model){
        List<Dag> dags = dagService.getDagsByCreator(UserUtils.getUser().getUsername());
        model.addAttribute("dags",dags);
        return "dags";
    }

    @RequestMapping("/goAddDags")
    public String goAddDags(Model model){
        return "adddag";
    }

    @RequestMapping("/addDags")
    public String addDags(Dag dag){
        if(dag != null){
            dagService.addDag(dag);
        }
        return "dags";
    }
}
