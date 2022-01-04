package org.roon.display.controller.mine;

import org.roon.display.controller.dto.SampleDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class MySampleController {
    @GetMapping("/mine/ex2")
    public String ex2(Model model){
        SampleDto sampleDto = SampleDto.builder()
                .id(1)
                .name("leemr")
                .time(LocalDateTime.now())
                .build();

        model.addAttribute("sampleDto",sampleDto);

        return "mine/ex2";
    }
}
