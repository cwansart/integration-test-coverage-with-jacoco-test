package de.cwansart.test.domain;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class CalculationServiceImpl implements CalculationService {

    private static final int MIN_TIMEOUT = 1;

    private static final int MAX_TIMEOUT = 5;

    public int calculate(CalculationMode calculationMode) {
        int calculatedMinTimeout;
        if (calculationMode == CalculationMode.NORMAL) {
            System.out.println("Called normal calculation mode");
            calculatedMinTimeout = MIN_TIMEOUT;
        } else {
            System.out.println("Called longer calculation mode.");
            calculatedMinTimeout = MIN_TIMEOUT + 3;
        }

        int sleepTime = ThreadLocalRandom.current().nextInt(calculatedMinTimeout, MAX_TIMEOUT + 1);
        try {
            TimeUnit.SECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.err.println("Sleep failed: " + e.getMessage());
        }

        return sleepTime;
    }
}
