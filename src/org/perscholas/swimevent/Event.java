package org.perscholas.swimevent;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;
    private String time;
    private List<Competitor> lanes;

    public Event(String name, String time) {
        this.name = name;
        this.time = time;
        this.lanes = new ArrayList<>(8);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Tries to add competitor to event
     *
     * If unable to add competitor, returns false. Otherwise returns true
     * @param competitor Competitor to add to this event
     * @return True if Competitor was successfully added, false otherwise
     */
    public boolean addCompetitor(Competitor competitor) {
        if (this.lanes.size() > 7 || this.lanes.contains(competitor)) {
            return false;
        }
        return this.lanes.add(competitor);
    }

    public void displayEvent() {
        System.out.println(getName());
        System.out.println(getTime());
        for (int i = 0; i < lanes.size(); i++) {
            System.out.printf("Lane: %d, Competitor: %s%n", i + 1, lanes.get(i).getName());
        }
    }
}
