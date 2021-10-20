package com.hendisantika.controller;

import com.hendisantika.service.SpringDataJpaNativeQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-data-jpa-native-query-to-dto
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/10/21
 * Time: 19.46
 */
@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private SpringDataJpaNativeQueryService springDataJpaNativeQueryService;
}
