package com.hendisantika.service;

import com.hendisantika.dto.EventDto;
import com.hendisantika.repository.SpringDataJpaNativeQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-data-jpa-native-query-to-dto
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/10/21
 * Time: 08.52
 */
@Service
public class SpringDataJpaNativeQueryService {
    @Autowired
    private SpringDataJpaNativeQueryRepository springDataJpaNativeQueryRepository;

    public List<EventDto> getEventList() {
        List<EventDto> eventList = springDataJpaNativeQueryRepository.findAll().stream().map(e -> {
            EventDto dto = new EventDto();

            dto.setId(e.getId());
            dto.setTitle(e.getTitle());
            dto.setUrl(e.getUrl());
            dto.setClasz(e.getClasz());
            dto.setStart(e.getStartDate().getTime());
            dto.setEnd(e.getEndDate().getTime());

            return dto;
        }).collect(Collectors.toList());

        return eventList;

    }

    public List<SpringDataJpaNativeQueryRepository.Event> getEvents() {
        return springDataJpaNativeQueryRepository.getEvents();
    }

    public List<EventDto> getEventList2() {
        return springDataJpaNativeQueryRepository.getEventList();
    }

    public EventDto getEventById(int id) {
        return springDataJpaNativeQueryRepository.getEventById(id);
    }
}
