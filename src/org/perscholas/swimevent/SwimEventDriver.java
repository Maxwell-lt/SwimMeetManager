package org.perscholas.swimevent;

import java.util.ArrayList;
import java.util.List;

public class SwimEventDriver {
    public static void main(String[] args) {
        List<Event> events = new ArrayList<>();

        events.add(new Event("Morning", "09:00"));
        events.add(new Event("Morning 2", "09:30"));
        events.add(new Event("Noon", "12:00"));
        events.add(new Event("Afternoon", "03:00"));
        events.add(new Event("Afternoon 2", "05:00"));


    }
}
