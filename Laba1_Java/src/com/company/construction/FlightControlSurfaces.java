package com.company.construction;

public class FlightControlSurfaces{
    private String group;

    public FlightControlSurfaces(String group) {
        this.group = group;
    }

    public void construct() {
        System.out.println("Group: " + group + " is constructed.");
    }

    public void Info() {
        System.out.println("\nFlight Control Surfaces: ");
        construct();
    }

    public String getGroup() {
        return group;
    }
}
