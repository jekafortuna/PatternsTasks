package ua.kpi.PatternsTasks.VGAAdapter;

/**
 * Created by Evgeniy on 18.01.2017.
 */
public class SVGA implements SVGAAdapter {
    @Override
    public void connectAnalog() {
        System.out.println("Connecting SVGA (analog) socket ...");
    }
}
