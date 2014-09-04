package net.adamsmolnik.activities.util;

import java.util.Date;

/**
 * @author ASmolnik
 *
 */
public class ResultImpl implements Result {

    @Override
    public void display(String message, double result) {
        System.out.println(new Date() + "|" + message + ": " + result);
    }

}
