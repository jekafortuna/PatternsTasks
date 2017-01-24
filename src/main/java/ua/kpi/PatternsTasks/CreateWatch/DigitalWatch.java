package ua.kpi.PatternsTasks.CreateWatch;

import java.util.Date;

/**
 * Created by Evgeniy on 05.01.2017.
 */
public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
