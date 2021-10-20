package com.hendisantika.repository;

import com.hendisantika.dto.EventDto;
import com.hendisantika.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

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
    @Query(value = "SELECT e.id, e.title, e.url, e.clasz, UNIX_TIMESTAMP(start_date)*1000 AS start, UNIX_TIMESTAMP" +
            "(end_date)*1000 AS END FROM event e", nativeQuery = true)
    List<Event> getEvents();

    interface Event {

        String getId();

        String getTitle();

        String getUrl();

        String getClasz();

        String getStart();

        String getEnd();

    }

    @Query("SELECT new com.hendisantika.dto(e.id, e.title, e.url, e.clasz, " +
            "UNIX_TIMESTAMP(start_date)*1000 as start, UNIX_TIMESTAMP(end_date)*1000 as end) FROM Event e")
    List<EventDto> getEventList();

    @Query("SELECT new com.hendisantika.dto(e.id, e.title, e.url, e.clasz, UNIX_TIMESTAMP(start_date)*1000 as start, " +
            "UNIX_TIMESTAMP(end_date)*1000 as end) FROM Event e WHERE e.id = ?1")
    EventDto getEventById(int id);
}
