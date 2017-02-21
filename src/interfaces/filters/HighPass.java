package interfaces.filters;

/**
 * Created by ty on 2016/10/11.
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) { return input; }
}
