package innerclasses;

import innerclasses.controller.Event;

/**
 * Created by ty on 2016/11/2.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
            gc.new ThermostatNight(0),
                gc.new lightOn(200),
                gc.new lightOff(400),
                gc.new waterOn(600),
                gc.new waterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1)
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));

        gc.run();
    }
}





























