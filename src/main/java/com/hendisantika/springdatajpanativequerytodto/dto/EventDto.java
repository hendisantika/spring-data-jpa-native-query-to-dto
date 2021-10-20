package com.hendisantika.springdatajpanativequerytodto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-data-jpa-native-query-to-dto
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/10/21
 * Time: 08.46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
    private int id;

    private String title;

    private String url;

    private String clasz;

    private long start;

    private long end;

}
