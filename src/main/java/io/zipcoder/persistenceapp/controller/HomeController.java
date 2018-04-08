package io.zipcoder.persistenceapp.controller;

import io.zipcoder.persistenceapp.services.serviceinterface.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * project: persistence-starter
 * package: io.zipcoder.persistenceapp.controller
 * author: https://github.com/vvmk
 * date: 4/8/18
 */
@RestController
public class HomeController {

    private HomeService homeService;

    @Autowired
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }
}
