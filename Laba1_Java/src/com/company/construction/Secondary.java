package com.company.construction;

public class Secondary extends FlightControlSurfaces{
    private String trimTabs;
    private String springTabs;
    Primary primarySurface;

    public Secondary(String name, String trimTabs, String springTabs,Primary primary) {
        super(name);
        this.trimTabs = trimTabs;
        this.springTabs = springTabs;
        this.primarySurface = primary;
    }

    @Override
    public void construct() {
        primarySurface.addElement(trimTabs);
        System.out.println(springTabs + " are added to the construction.");
    }

    @Override
    public void Info() {
        System.out.println("\n" + getGroup() + " group is being constructed: \n");
        construct();
    }
}
