package org.roon.display.controller.mine;

import org.roon.display.controller.dto.SampleDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class MySampleController {
    @GetMapping("/mine/dto")
    public String getDto(Model model){
        SampleDto sampleDto = SampleDto.builder()
                .id(1)
                .name("leemr")
                .time(LocalDateTime.now())
                .build();

        model.addAttribute("sampleDto",sampleDto);

        return "mine/dto";
    }

    @GetMapping("/mine/dtoList")
    public String getDtoList(Model model){
        var dtoList = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> {
                    SampleDto dto = SampleDto.builder()
                            .id(i)
                            .name("leemr")
                            .time(LocalDateTime.now())
                            .build();
                    return dto;
                }).collect(Collectors.toList());

        model.addAttribute("dtoList", dtoList);

        return "mine/dtoList";
    }

    @GetMapping("/mine/inlineJs")
    public String inlineJs(Model model){
        SampleDto dto = SampleDto.builder()
                .id(1)
                .name("leemr")
                .time(LocalDateTime.now())
                .build();

        model.addAttribute("status","success");
        model.addAttribute("dto",dto);

        return "mine/inlineJs";
    }
}
