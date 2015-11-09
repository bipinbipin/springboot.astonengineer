package com.astontech.astonengineer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bipin on 10/5/2015.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    String index() {return "index"; }
    
}
