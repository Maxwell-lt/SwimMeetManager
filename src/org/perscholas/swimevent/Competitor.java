package org.perscholas.swimevent;

import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class Competitor {
    private String name;
    private Set<Event> eventList;

    public Competitor(String name) {
        this.name = name;
        eventList = new HashSet<>();
    }

    public void registerForEvents(Set<Event> events) {
        for (Event event : events) {
            if (event.addCompetitor(this)) {
                eventList.add(event);
            }
        }
    }

    public Set<Event> getEventList() {
        return eventList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Competitor.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("eventList=" + eventList)
                .toString();
    }
}
