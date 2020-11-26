package com.company.construction;

public class Fuselage implements Construction {
    private String type;
    Material material;
    private String bulkheads;
    private String frames;
    private String formers;
    private String stringers;
    private int strength = 0;
    private int weight = 0;
    private String shape;

    public Fuselage(String type, Material constrMaterial,String bulkheads,String frames, String formers,String stringers) {
        this.type = type;
        this.material = constrMaterial;
        this.bulkheads = bulkheads;
        this.frames = frames;
        this.formers = formers;
        this.stringers = stringers;
    }

    @Override
    public String construction() {
        if(type == "monocoque") {
            shape = shapeBuilder();
        } else if(type == "semimonocoque") {
            shape = shapeBuilder();
            strength++;
        }
        return shape;
    }

    public String shapeBuilder() {
        StringBuilder builder = new StringBuilder("Shape consists of:  ");
        builder.append(formers)
                .append(" , ")
                .append(frames)
                .append(" , ")
                .append(bulkheads);
        return builder.toString();
    }

    @Override
    public void Info() {
        System.out.println("\nFuselage: " + construction() + "\nMaterial: " + material.getTitle());
    }

    public void addElement(String element) {
        System.out.println(element + " are attached to the fuselage.");
    }

    public static void main(String[] args) {
        Fuselage fuselage = new Fuselage("monocoque", Material.ALLOY, "blukheads","frames","formers","dfsdf");
        System.out.println(fuselage.construction());
    }
}
