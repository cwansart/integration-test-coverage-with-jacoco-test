package de.cwansart.test.adapter;

public class CalculationResponseDTO {

    private final String message;

    public CalculationResponseDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
