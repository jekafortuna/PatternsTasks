package ua.kpi.PatternsTasks.VGAAdapter;

/**
 * Created by Evgeniy on 18.01.2017.
 */
public class DVI implements DVIAdapter {
    private SVGA svga;

    public DVI(SVGA svga) {
        this.svga = svga;
    }

    @Override
    public void connectDigital() {
        svga.connectAnalog();
        System.out.println("Connecting to DVI socket ...");
    }
}
