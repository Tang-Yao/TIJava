package innerclasses;

import innerclasses.controller.*;

/**
 * Created by ty on 2016/11/2.
 */
public class GreenhouseControls extends Controller{
    private boolean light = false;
    public class lightOn extends Event {
        public lightOn(long delayTime) { super(delayTime); }
        @Override
        public void action() {
            light = true;
        }

        public String toString() {
            return "Light is on";
        }
    }

    public class lightOff extends Event {
        public lightOff(long delayTime) { super(delayTime); }
        @Override
        public void action() {
            light = false;
        }

        public String toString() {
            return "Light is off";
        }
    }

    private boolean water = false;
    public class waterOn extends Event {
        public waterOn(long delayTime) { super(delayTime); }

        @Override
        public void action() {
            water = true;
        }

        public String toString() {
            return "Greenhouse water is on";
        }
    }

    public class waterOff extends Event {
        public waterOff(long delayTime) { super(delayTime); }

        @Override
        public void action() {
            water = false;
        }

        public String toString() {
            return "Greenhouse water is off";
        }
    }

    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) { super(delayTime); }

        @Override
        public void action() {
            thermostat = "Night";
        }

        public String toString() {
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) { super(delayTime); }

        @Override
        public void action() {
            thermostat = "Day";
        }

        public String toString() {
            return "Thermostat on day setting";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) { super(delayTime); }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString() {
            return "Ring";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        public String toString() {
            return "Restarting system";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) { super(delayTime); }

        @Override
        public void action() {
            System.exit(0);
        }

        public String toString() {
            return "Terminating";
        }
    }
}



































