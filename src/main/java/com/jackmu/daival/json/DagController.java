package com.jackmu.daival.json;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DagController {

    @RequestMapping("/dag/{dagsId}")
    public String dag(@PathVariable String dagsId, Model model){
        System.out.println(dagsId);
        model.addAttribute("msg",new int[]{1,2,3,4});
        return "dag-list";
    }

    @RequestMapping("/addDagContent")
    public String addDagContent(Model model){
        return "add-dag-content";
    }
}
