package net.adamsmolnik.activities.maths;

import java.util.List;

/**
 * @author ASmolnik
 *
 */
public class OperationActivitiesImpl implements OperationActivities {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    @Override
    public double sum(List<Double> addends) {
        return addends.stream().mapToDouble(d -> d).sum();
    }

}
