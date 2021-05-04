package de.cwansart.test.adapter;

import de.cwansart.test.domain.CalculationMode;

public class CalculationRequestDTO {

    private CalculationMode calculationMode;

    public CalculationMode getCalculationMode() {
        return calculationMode;
    }

    public void setCalculationMode(CalculationMode calculationMode) {
        this.calculationMode = calculationMode;
    }
}
