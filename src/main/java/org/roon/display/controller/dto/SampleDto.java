package org.roon.display.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class SampleDto {
    private int id;
    private String name;
    private LocalDateTime time;
}
