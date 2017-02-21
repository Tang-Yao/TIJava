package interfaces.filters;

/**
 * Created by ty on 2016/10/11.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Waveform " + id; }
}
