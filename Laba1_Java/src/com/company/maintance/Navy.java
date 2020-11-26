package com.company.maintance;

import com.company.construction.*;

import java.util.*;

public class Navy extends Plane{

    private int id;
    public static Map<Integer, Navy> allPlanes = new HashMap<>();
    private static int countId = 0;

    public Navy(String model, String manufacturer, String status, String cost, Material material,int speed) {
        super(model,manufacturer,status,cost,material,speed);

        if (!hasPlane()) {
            countId++;
            this.id = countId;
            allPlanes.put(id,this);
        }
    }

    @Override
    public void AircraftConstruction() throws ConstructionIsNotFinishedException {
        System.out.println("Constructing an aircraft");
        Fuselage fuselage = new Fuselage("monocoque", Material.ALLOY, "bulkheads","frames","formers","stringers");
        Wing leftWing = new Wing(Material.ALLOY, "left spar", "right spar", "first rib", "second rib");
        Wing rightWing = new Wing(Material.ALLOY, "left spar", "right spar", "first rib", "second rib");
        Stabilizer firstStabilizer = new Stabilizer("vertical");
        Stabilizer secondStabilizer = new Stabilizer("horizontal");
        Primary primaryGroup = new Primary("primary","ailerons", "elevators", "rudders", leftWing,rightWing,firstStabilizer,secondStabilizer);
        Secondary secGroup = new Secondary("secondary","trim tabs", "spring tabs",primaryGroup);
        Auxiliary auxGroup = new Auxiliary("auxiliary", "spoilers" , "speed brakes", "slats",leftWing,rightWing,fuselage);
        Auxiliary.WingFlaps wingFlaps = auxGroup.new WingFlaps("plain flaps","split flaps", "fowler flaps", "leading flaps");

        if(!isEmpty(fuselage) && !isEmpty(leftWing) && !isEmpty(rightWing) && !isEmpty(firstStabilizer) && !isEmpty(secondStabilizer)) {
            System.out.println("Successfully constructing");
        } else {
            throw new ConstructionIsNotFinishedException("Failed to construct " + getModel());
        }

        fuselage.Info();
        leftWing.Info();
        rightWing.Info();
        firstStabilizer.Info();
        secondStabilizer.Info();
        primaryGroup.Info();
        secGroup.Info();
        auxGroup.Info();
        wingFlaps.Info();
    }

    @Override
    public void AircraftInfo(){
        System.out.println("Model: " + getModel() + "\nManufacturer: " + getManufacturer()
                            + "\nStatus: " + getStatus() + "\nCost: " + getCost() + "\n" + getMaterial() + "\nSpeed: " + getSpeed());
    }

    public static boolean isEmpty( Object object ){
        if( object == null ){
            return true;
        }
        return false;
    }

    private boolean hasPlane() {
        for(Navy plane : allPlanes.values()) {
            if (plane.equals(this) && plane.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }

    public static List<Navy> getAllPlanes() {
        return new ArrayList<>(allPlanes.values());
    }

    public static List<Navy> getAllPlanes(Material material) {
        List<Navy> listAllPlanes = new ArrayList<>();
        for (Navy plane : allPlanes.values()) {
            if (plane.material == material) {
                listAllPlanes.add(plane);
            }
        }
        return listAllPlanes;
    }

    public static int getHowManyPlanes() {
        return allPlanes.size();
    }

    public static int getHowManyPlanes(Material material) {
        return getAllPlanes(material).size();
    }

    public static  int getAllSpeedPlanes() {
        int count = 0;
        for (Navy plane : allPlanes.values()) {
            count += plane.getSpeed();
        }
        return count;
    }

    public static  int getAllSpeedPlanes(Material material) {
        int count = 0;
        for (Navy plane : getAllPlanes(material)) {
            count += plane.getSpeed();
        }
        return count;
    }


    public boolean equals(Navy obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        //Navy other = (Navy) obj;
        return getSpeed() == obj.getSpeed() &&
                Objects.equals(getModel(), obj.getModel()) &&
                Objects.equals(getManufacturer(), obj.getManufacturer()) &&
                Objects.equals(getCost(), obj.getCost()) &&
                Objects.equals(getStatus(), obj.getStatus()) &&
                Objects.equals(getMaterial(), obj.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeed(),getModel(),getManufacturer(),getCost(),getStatus(),getMaterial());
    }

    public static void main(String[] args) {
        Navy boeing = new Navy("F/A-18E/F Super Hornet", "McDonnell Douglas", "In service", "US$66.0 million", Material.ALLOY, 1915);
        Navy grumman = new Navy("E-2 Hawkeye","Northrop Grumman", "In service", "US$176 million", Material.ALUMINUM, 650);
        Navy boeing2 = new Navy("E-6 Mercury","Boeing", "In service", "US$141.7 million",Material.ALLOY, 980);
        Navy lockheed = new Navy("EP-3","Lockheed Corporation", "Active", "US$36 million",Material.TITANIUM, 700);
        Navy boeing3 = new Navy("EA-18G Growler","Boeing", "In service", "US$68.2 million",Material.ALLOY, 1900);
        Navy lockheed1 = new Navy("P-3 Orion","Lockheed Corporation", "Active", "US$36 million",Material.TITANIUM, 761);
        Navy boeing4 = new Navy("P-8 Poseidon","Boeing", "In service", "US$256.5 million",Material.ALLOY, 907);


        boeing.AircraftConstruction();
        grumman.AircraftConstruction();
        boeing2.AircraftConstruction();
        lockheed.AircraftConstruction();
        boeing3.AircraftConstruction();
        lockheed1.AircraftConstruction();
        boeing4.AircraftConstruction();
//        try {
//            boeing.AircraftConstruction();
//        } catch (ConstructionIsNotFinishedException e) {
//            System.out.println(e.getMessage());
//            System.out.println("Some details are missing.");
//        } finally {
//            System.out.println("Finally!");
//        }
//
        System.out.println(boeing.equals(new ArrayList<>()));
//
//        ArrayList<String> models = new ArrayList<>(Arrays.asList(boeing.getModel(),boeing1.getModel(),grumman.getModel(),boeing2.getModel(),
//                lockheed.getModel(),boeing3.getModel(),lockheed1.getModel(),boeing4.getModel()));
//        Iterator<String> iter = models.iterator();
//        while(iter.hasNext()) {
//            System.out.println(iter.next());
//        }
    }
}
