package ua.kpi.PatternsTasks.CreateWatch;

/**
 * Created by Evgeniy on 05.01.2017.
 */
public class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
