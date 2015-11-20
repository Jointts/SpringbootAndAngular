package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by joona_000 on 18.11.2015.
 */

@Controller
public class MainController {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloWorld(Model model){
        return "helloWorld";
    }

}
