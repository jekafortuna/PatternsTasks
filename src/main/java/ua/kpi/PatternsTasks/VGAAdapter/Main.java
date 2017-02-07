package ua.kpi.PatternsTasks.VGAAdapter;

/**
 * Created by Evgeniy on 18.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        SVGA svga = new SVGA();

        System.out.println("We have SVGA output on our PC");
        svga.connectAnalog();

        System.out.println("Fail! We must create adapter to connect to DVI");

        DVI dvi = new DVI(svga);

        System.out.println("Adapter created! Connected with adapter ");
        dvi.connectDigital();
    }
}
