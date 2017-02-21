package interfaces.filters;

/**
 * Created by ty on 2016/10/11.
 */
public class BandPass extends Filter {
    double lowCutOff, highCutOff;
    public BandPass(double lowCut, double highCut) {
        lowCutOff = lowCut;
        highCutOff = highCut;
    }

    public Waveform proces(Waveform input) { return input; }
}
