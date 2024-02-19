package com.telemetrics.service;

import com.telemetrics.dto.SimResponseDto;
import com.telemetrics.repository.SimCardRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class SimCardServiceImpl implements SimCardService{
    private SimCardRepository simCardRepository;

    @Override
    public List<SimResponseDto> getAllSim () {
        return simCardRepository.findAll();
    }
}