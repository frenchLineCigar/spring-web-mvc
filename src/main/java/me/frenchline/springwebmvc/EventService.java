package me.frenchline.springwebmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author swlee
 * @contact frenchline707@gmail.com
 * @since 2019-10-31
 */
@Service
public class EventService {

    public List<Event> getEvents() {
        Event event1 = Event.builder()
                .name("스프링 웹 MVC 스터디 1차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019, 1,10, 10, 0))
                .endDateTime(LocalDateTime.of(2019, 1,10, 12, 10))
                .build();

        Event event2 = Event.builder()
                .name("스프링 웹 MVC 스터디 2차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019, 1,17, 17, 59))
                .endDateTime(LocalDateTime.of(2019, 1,17, 23, 41))
                .build();

        return List.of(event1, event2);
    }
}
