package com.hendisantika.springbootjdbc3.repository;

import com.hendisantika.springbootjdbc3.entity.SystemExample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jdbc3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/09/18
 * Time: 06.18
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface SystemRepository extends CrudRepository<SystemExample, Long> {
}