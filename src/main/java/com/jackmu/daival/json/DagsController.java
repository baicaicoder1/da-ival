package com.jackmu.daival.json;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DagsController {

    @RequestMapping("/dags")
    public String dags(Model model){
        model.addAttribute("msg",new int[]{1,2,3});
        return "dags";
    }

    @RequestMapping("/addDags")
    public String addDag(Model model){
        return "adddag";
    }
}
