package org.roon.display.controller;

import org.roon.display.controller.dto.SampleDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class SampleController {
    @GetMapping("/ex1")
    public String ex1() {
        return "ex1";
    }

    @GetMapping("/ex2")
    public String ex2(Model model) {

        var dtoList = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> {
                    SampleDto dto = SampleDto.builder()
                            .id(1)
                            .name("leemr")
                            .time(LocalDateTime.now())
                            .build();
                    return dto;
                }).collect(Collectors.toList());

        model.addAttribute("dtoList", dtoList);

        return "ex2";

    }
}
