package com.telemetrics.service;

import com.telemetrics.dto.SimResponseDto;

import java.util.List;

public interface SimCardService {

    List<SimResponseDto> getAllSim();
}
