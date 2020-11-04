package me.frenchline.springwebmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author swlee
 * @contact frenchline707@gmail.com
 * @since 2019-10-31
 */
@Controller
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/events") // = @RequestMapping(value = "/events", method = RequestMethod.GET)
    public String events(Model model) {
        //이벤트 목록을 넘겨준다
        model.addAttribute("events", eventService.getEvents());
        return "events/list";
    }
}

/*
● Spring 4.3 이후 @RequestMapping(method = RequestMethod.GET)을 @GetMapping으로 대체 할 수 있다.
● 사용하는 Spring 버전을 4.3 이상으로 올리는 걸 권장한다. 이것은 단순히 애노테이션 뿐만이 아니라 4.3 이전 버전에는 Security 이슈가 있다.
 */