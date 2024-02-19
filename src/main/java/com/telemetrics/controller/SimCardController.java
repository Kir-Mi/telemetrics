package com.telemetrics.controller;

import com.telemetrics.dto.SimResponseDto;
import com.telemetrics.service.SimCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sim")
@RequiredArgsConstructor
public class SimCardController {
    private final SimCardService simCardService;

    @GetMapping
    public List<SimResponseDto> getAllSim() {
        return simCardService.getAllSim();
    }
}
