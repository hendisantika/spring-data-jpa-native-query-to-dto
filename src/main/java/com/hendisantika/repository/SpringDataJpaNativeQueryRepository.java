package com.hendisantika.repository;

import com.hendisantika.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-data-jpa-native-query-to-dto
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/10/21
 * Time: 08.48
 */
public interface SpringDataJpaNativeQueryRepository extends JpaRepository<Event, Integer> {
}
