package com.hendisantika.controller;

import com.hendisantika.dto.EventDto;
import com.hendisantika.repository.SpringDataJpaNativeQueryRepository;
import com.hendisantika.service.SpringDataJpaNativeQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping
    public List<EventDto> getEventList() {
        return springDataJpaNativeQueryService.getEventList();
    }

    @GetMapping("/1")
    public List<SpringDataJpaNativeQueryRepository.Event> getEvents() {
        return springDataJpaNativeQueryService.getEvents();
    }

    @GetMapping("/2")
    public List<EventDto> getEventList2() {
        return springDataJpaNativeQueryService.getEventList();
    }

    @GetMapping("/3/{id}")
    public EventDto getEventById(@PathVariable int id) {
        return springDataJpaNativeQueryService.getEventById(id);
    }
}
