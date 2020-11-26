package com.company.construction;

public enum Material {
    ALLOY ("Alloy"),
    ALUMINUM ("Aluminum"),
    MAGNESIUM ("Magnesium"),
    TITANIUM ("Titanium"),
    STEEL_ALLOYS ("Steel alloy"),
    TRANSPARENT_PLASTIC ("Transparent plastic"),
    REINFORCED_PLASTIC ("Reinforced plastic");

    private String title;

    Material(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Material: " + title + " , ";
    }
}