package com.test.project.controller;

import com.test.project.controller.common.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hanzhongxing on 2018/4/8.
 */
@Controller
public class HomeController {
    protected final static Logger logger= LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/home/index")
    public String index(){

        logger.error("/home/index");


        return "index";
    }
}
