package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.repository.HomeRepository;
import io.zipcoder.persistenceapp.services.serviceinterface.HomeService;
import org.springframework.stereotype.Service;

/**
 * project: persistence-starter
 * package: io.zipcoder.persistenceapp.services
 * author: https://github.com/vvmk
 * date: 4/8/18
 */

@Service
public class JpaHomeService implements HomeService {

    private HomeRepository homeRepo;

    public JpaHomeService(HomeRepository homeRepo) {
        this.homeRepo = homeRepo;
    }
}
