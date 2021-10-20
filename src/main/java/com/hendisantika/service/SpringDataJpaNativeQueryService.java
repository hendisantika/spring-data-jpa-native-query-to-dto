package com.hendisantika.service;

import com.hendisantika.repository.SpringDataJpaNativeQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
