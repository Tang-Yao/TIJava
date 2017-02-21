package interfaces.filters;

/**
 * Created by ty on 2016/10/11.
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) { return input; }
}
