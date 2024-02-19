package com.telemetrics.model;

import com.telemetrics.enums.Operator;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table()
@Data
public class SimCard {
    private int number;
    private int icc;
    private Region region;
    private Operator operator;
    private LocalDate dateReceivedByDealer;
    private LocalDate dateReceivedByAgent;
    private LocalDate dateOfActivation;

}
