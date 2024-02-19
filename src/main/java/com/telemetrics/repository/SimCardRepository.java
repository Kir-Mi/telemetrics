package com.telemetrics.repository;

import com.telemetrics.model.SimCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimCardRepository extends JpaRepository<SimCard, Integer> {
}
