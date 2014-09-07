package net.adamsmolnik.activities.util;

import java.util.Date;

/**
 * @author ASmolnik
 *
 */
public class ResultActivitiesImpl implements ResultActivities {

    @Override
    public void display(String message, double result, String processId) {
        System.out.println(new Date() + "|" + message + " -> " + result + " done by processId: " + processId);
    }

}
