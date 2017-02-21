package interfaces.interfaceprocessor;

/**
 * Created by ty on 2016/10/11.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
