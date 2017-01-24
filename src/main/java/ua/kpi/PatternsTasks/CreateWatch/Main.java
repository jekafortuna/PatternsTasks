package ua.kpi.PatternsTasks.CreateWatch;

/**
 * Created by Evgeniy on 05.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("Digital");
        Watch watch = maker.createWatch();
        watch.showTime();

    }
    public static WatchMaker getMakerByName(String maker) {
        if (maker.equals("Digital")) {
            return new DigitalWatchMaker();
        } else if (maker.equals("Rome")) {
            return new RomeWatchMaker();
        } else {
            throw new RuntimeException("No such maker : " + maker);
        }
    }
}
