package com.company.construction;

public class Auxiliary extends FlightControlSurfaces{
    private String spoilers;
    private String speedBrakes;
    private String slats;
    Wing firstWing;
    Wing secondWing;
    Fuselage fuselage;

    public Auxiliary(String name, String spoilers, String speedBrakes, String slats, Wing first, Wing second, Fuselage f) {
        super(name);
        this.spoilers = spoilers;
        this.speedBrakes = speedBrakes;
        this.slats = slats;
        this. firstWing = first;
        this.secondWing = second;
        this.fuselage = f;
    }

    @Override
    public void Info() {
        System.out.println("\n: " + getGroup() + " group is being constructed: \n");
        construct();
    }

    @Override
    public void construct() {
        firstWing.addElement(spoilers, "first");
        secondWing.addElement(spoilers, "second");
        fuselage.addElement(speedBrakes);
        firstWing.addElement(slats,"first");
        secondWing.addElement(slats,"second");
    }

    public class WingFlaps {
        public String plainFlaps;
        public String splitFlaps;
        public String fowlerFlaps;
        public String leadingEdgeFlap;
        private String wingFlaps;

        public WingFlaps(String plain,String split,String fowler,String leading) {
            this.plainFlaps = plain;
            this.splitFlaps = split;
            this.fowlerFlaps = fowler;
            this.leadingEdgeFlap = leading;
        }

        public void constructWingFlaps() {
            wingFlaps = plainFlaps + " ," + splitFlaps + " ," + fowlerFlaps + " ," + leadingEdgeFlap;
            firstWing.addElement(wingFlaps,"first");
            secondWing.addElement(wingFlaps,"second");
        }

        public void Info() {
            System.out.println("\nIn " + getGroup() + " group : \n");
            constructWingFlaps();
        }
    }
}
