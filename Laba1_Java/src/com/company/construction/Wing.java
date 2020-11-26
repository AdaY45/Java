package com.company.construction;

public class Wing implements Construction{
    Material material;
    private String leftSpar;
    private String rightSpar;
    private String firstRib;
    private String secondRib;
    private String falseSpar;
    private String construction;
    private String shape;

    public Wing(Material material, String leftSpar,String rightSpar,String firstRib, String secondRib) {
        this.material = material;
        this.leftSpar = leftSpar;
        this.rightSpar = rightSpar;
        this.firstRib = firstRib;
        this.secondRib = secondRib;
    }

    @Override
    public String construction() {
        construction = leftSpar + " , " + rightSpar;
        shape = firstRib + " , " + secondRib;
        if(falseSpar != "") {
            construction += falseSpar;
        }
        return "\nConstruction: " + construction + "\nShape: " + shape;
    }

    @Override
    public void Info() {
        System.out.println("\nWing: " + construction() + "\nMaterial: " + material.getTitle());
    }

    public void addElement(String element,String name) {
        System.out.println(element + " are attached to the " + name + " wing.");
    }
}
