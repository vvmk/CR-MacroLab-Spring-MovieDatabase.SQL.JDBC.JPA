package io.zipcoder.persistenceapp.repository;

import io.zipcoder.persistenceapp.entity.Home;
import org.springframework.data.repository.CrudRepository;

/**
 * project: persistence-starter
 * package: io.zipcoder.persistenceapp.repository
 * author: https://github.com/vvmk
 * date: 4/8/18
 */
public interface HomeRepository extends CrudRepository<Home, Long> {
}
