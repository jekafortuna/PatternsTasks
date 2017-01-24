package ua.kpi.PatternsTasks.CreateWatch;

/**
 * Created by Evgeniy on 05.01.2017.
 */
public class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
