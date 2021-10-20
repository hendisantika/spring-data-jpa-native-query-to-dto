package com.hendisantika;

import com.hendisantika.service.SpringDataJpaNativeQueryService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class SpringDataJpaNativeQueryToDtoApplication implements CommandLineRunner {
    @Autowired
    private SpringDataJpaNativeQueryService springDataJpaNativeQueryService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaNativeQueryToDtoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("=======================================");
        springDataJpaNativeQueryService.getEvents().stream()
                .forEach(e -> log.info("id=" + e.getId() + ", title=" + e.getTitle() + ", url=" + e.getUrl()
                        + ", clasz=" + e.getClasz() + ", start=" + e.getStart() + ", end=" + e.getEnd()));
        log.info("---------------------------------------");
        springDataJpaNativeQueryService.getEventList().stream().forEach(e -> log.info(e));
        log.info("---------------------------------------");
        springDataJpaNativeQueryService.getEventList2().stream().forEach(e -> log.info(e));
        log.info("---------------------------------------");
        log.info(springDataJpaNativeQueryService.getEventById(2));
        log.info("---------------------------------------");
        springDataJpaNativeQueryService.getEventListByClaszAndEnd("event-success", 1523370662000l).stream().forEach(e -> log.info(e));
        log.info("=======================================");
    }
}
