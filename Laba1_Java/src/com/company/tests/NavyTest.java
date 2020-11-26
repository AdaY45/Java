package com.company.tests;

import com.company.construction.*;
import com.company.maintance.Navy;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NavyTest {

    private Navy boeing;
    private Navy grumman;
    private Navy boeing2;
    private Navy lockheed;
    private Navy boeing3;
    private Navy lockheed1;
    private Navy boeing4;

    @BeforeEach
    public void setUp() throws Exception {
        boeing = new Navy("F/A-18E/F Super Hornet", "McDonnell Douglas", "In service", "US$66.0 million", Material.ALLOY, 1915);
        grumman = new Navy("E-2 Hawkeye","Northrop Grumman", "In service", "US$176 million", Material.ALUMINUM, 650);
        boeing2 = new Navy("E-6 Mercury","Boeing", "In service", "US$141.7 million",Material.ALLOY, 980);
        lockheed = new Navy("EP-3","Lockheed Corporation", "Active", "US$36 million",Material.TITANIUM, 700);
        boeing3 = new Navy("EA-18G Growler","Boeing", "In service", "US$68.2 million",Material.ALLOY, 1900);
        lockheed1 = new Navy("P-3 Orion","Lockheed Corporation", "Active", "US$36 million",Material.TITANIUM, 761);
        boeing4 = new Navy("P-8 Poseidon","Boeing", "In service", "US$256.5 million",Material.ALLOY, 907);
    }

    @Test
    public void getAllPlanes() {

        List<Navy> expected = Navy.getAllPlanes();

        List<Navy> actual = new ArrayList<>();
        actual.add(boeing);
        actual.add(grumman);
        actual.add(boeing2);
        actual.add(lockheed);
        actual.add(boeing3);
        actual.add(lockheed1);
        actual.add(boeing4);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllPlanes_NO_NULL() {
        List<Navy> expected = Navy.getAllPlanes();
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllPlanes_ALLOY() {
        Navy boeing = new Navy("F/A-18E/F Super Hornet", "McDonnell Douglas", "In service", "US$66.0 million", Material.ALLOY, 1915);
        Navy boeing2 = new Navy("E-6 Mercury","Boeing", "In service", "US$141.7 million",Material.ALLOY, 980);
        Navy boeing3 = new Navy("EA-18G Growler","Boeing", "In service", "US$68.2 million",Material.ALLOY, 1900);
        Navy boeing4 = new Navy("P-8 Poseidon","Boeing", "In service", "US$256.5 million",Material.ALLOY, 907);

        List<Navy> expected = Navy.getAllPlanes(Material.ALLOY);

        List<Navy> actual = new ArrayList<>();
        actual.add(boeing);
        actual.add(boeing2);
        actual.add(boeing3);
        actual.add(boeing4);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllPlanes_ALLOY_NO_NULL() {
        List<Navy> expected = Navy.getAllPlanes(Material.ALLOY);
        Assert.assertNotNull(expected);
    }

    public void getAllPlanes_ALUMINUM() {

        List<Navy> expected = Navy.getAllPlanes(Material.ALUMINUM);

        List<Navy> actual = new ArrayList<>();
        actual.add(grumman);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllPlanes_ALLUMINIUM_NO_NULL() {
        List<Navy> expected = Navy.getAllPlanes(Material.ALUMINUM);
        Assert.assertNotNull(expected);
    }

    public void getAllPlanes_MAGNESIUM() {

        List<Navy> expected = Navy.getAllPlanes(Material.MAGNESIUM);

        List<Navy> actual = new ArrayList<>();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllPlanes_MAGNESIUM_NO_NULL() {
        List<Navy> expected = Navy.getAllPlanes(Material.MAGNESIUM);
        Assert.assertNotNull(expected);
    }

    public void getAllPlanes_TITANIUM() {

        List<Navy> expected = Navy.getAllPlanes(Material.TITANIUM);

        List<Navy> actual = new ArrayList<>();
        actual.add(lockheed);
        actual.add(lockheed1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllPlanes_TITANIUM_NO_NULL() {
        List<Navy> expected = Navy.getAllPlanes(Material.TITANIUM);
        Assert.assertNotNull(expected);
    }

    public void getAllPlanes_STEEL_ALLOYS() {

        List<Navy> expected = Navy.getAllPlanes(Material.STEEL_ALLOYS);

        List<Navy> actual = new ArrayList<>();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllPlanes_STEEL_ALLOYS_NO_NULL() {
        List<Navy> expected = Navy.getAllPlanes(Material.STEEL_ALLOYS);
        Assert.assertNotNull(expected);
    }

    public void getAllPlanes_TRANSPARENT_PLASTIC() {

        List<Navy> expected = Navy.getAllPlanes(Material.TRANSPARENT_PLASTIC);

        List<Navy> actual = new ArrayList<>();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllPlanes_TRANSPARENT_PLASTIC_NO_NULL() {
        List<Navy> expected = Navy.getAllPlanes(Material.TRANSPARENT_PLASTIC);
        Assert.assertNotNull(expected);
    }

    public void getAllPlanes_REINFORCED_PLASTIC() {

        List<Navy> expected = Navy.getAllPlanes(Material.REINFORCED_PLASTIC);

        List<Navy> actual = new ArrayList<>();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllPlanes_REINFORCED_PLASTIC_NO_NULL() {
        List<Navy> expected = Navy.getAllPlanes(Material.REINFORCED_PLASTIC);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getHowManyPlanes() {
        int expected = Navy.getHowManyPlanes();

        int actual = 7;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHowManyPlanes_ALLOY() {
        int expected = Navy.getHowManyPlanes(Material.ALLOY);

        int actual = 4;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHowManyPlanes_ALUMINUM() {
        int expected = Navy.getHowManyPlanes(Material.ALUMINUM);

        int actual = 1;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHowManyPlanes_MAGNESIUM() {
        int expected = Navy.getHowManyPlanes(Material.MAGNESIUM);

        int actual = 0;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHowManyPlanes_TITANIUM() {
        int expected = Navy.getHowManyPlanes(Material.TITANIUM);

        int actual = 2;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHowManyPlanes_STEEL_ALLOYS() {
        int expected = Navy.getHowManyPlanes(Material.STEEL_ALLOYS);

        int actual = 0;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHowManyPlanes_TRANSPARENT_PLASTIC() {
        int expected = Navy.getHowManyPlanes(Material.TRANSPARENT_PLASTIC);

        int actual = 0;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHowManyPlanes_REINFORCED_PLASTIC() {
        int expected = Navy.getHowManyPlanes(Material.REINFORCED_PLASTIC);

        int actual = 0;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllSpeedPlanes() {
        int expected = Navy.getAllSpeedPlanes();

        int actual = 1915 + 650 + 980 + 700 + 1900 + 761 + 907;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllSpeedPlanes_ALLOY() {
        int expected = Navy.getAllSpeedPlanes(Material.ALLOY);

        int actual = 1915 + 980 + 1900 + 907;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllSpeedPlanes_ALUMINUM() {
        int expected = Navy.getAllSpeedPlanes(Material.ALUMINUM);

        int actual = 650;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllSpeedPlanes_MAGNESIUM() {
        int expected = Navy.getAllSpeedPlanes(Material.MAGNESIUM);

        int actual = 0;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllSpeedPlanes_TITANIUM() {
        int expected = Navy.getAllSpeedPlanes(Material.TITANIUM);

        int actual = 700 + 761;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllSpeedPlanes_STEEL_ALLOYS() {
        int expected = Navy.getAllSpeedPlanes(Material.STEEL_ALLOYS);

        int actual = 0;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllSpeedPlanes_TRANPARENT_PLASTIC() {
        int expected = Navy.getAllSpeedPlanes(Material.TRANSPARENT_PLASTIC);

        int actual = 0;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllSpeedPlanes_REINFORCED_PLASTIC() {
        int expected = Navy.getAllSpeedPlanes(Material.REINFORCED_PLASTIC);

        int actual = 0;

        Assert.assertEquals(expected,actual);
    }
}