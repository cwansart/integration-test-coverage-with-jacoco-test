package de.cwansart.test.domain;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class CalculationServiceImpl implements CalculationService {

    private final static int MIN_TIMEOUT = 1;

    private final static int MAX_TIMEOUT = 5;

    public int calculate(CalculationMode calculationMode) {
        int calculatedMinTimeout = calculationMode == CalculationMode.NORMAL ? MIN_TIMEOUT : MIN_TIMEOUT + 3;
        int sleepTime = ThreadLocalRandom.current().nextInt(calculatedMinTimeout, MAX_TIMEOUT + 1);

        try {
            TimeUnit.SECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return sleepTime;
    }
}
