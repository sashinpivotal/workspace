/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.entertainment;

import java.util.Arrays;

/**
 * Class definition to model the workings of a television set.
 * This is our "business class" in the lab series.
 * It does NOT have a main() method - most classes don't.
 */
public class Television {
    // CLASS (static) variables - these are shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = { "Samsung", "LG", "Sony", "Toshiba" };

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // PROPERTIES or ATTRIBUTES, generally called "fields" or "instance variables"
    // these live *inside each instance*
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;

    // CONSTRUCTORS - special methods that get called when the client says "new"
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();             // delegate to no-arg ctor for instance count
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);        // delegate to other ctor above for brand
        setVolume(volume);  // handle volume myself, by delegating to setter
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // BUSINESS METHODS (functions) - what operations can com.entertainment.Television objects do?
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    // ACCESSOR METHODS - these provide "controlled access" to the (private) fields
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        }
        else {
            String brands = Arrays.toString(VALID_BRANDS);
            System.out.println("Invalid brand: " + brand + ". Valid brands are " + brands + ".");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
        else {
            System.out.println("Invalid volume: " + volume + ". " +
                    "Valid range is [" + MIN_VOLUME + "-" + MAX_VOLUME + "].");
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private static boolean isValidBrand(String brand) {
        boolean isValid = false;

        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equalsIgnoreCase(brand)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    @Override
    public String toString() {
        return "com.entertainment.Television" +
                ": brand=" + getBrand() +
                ", volume=" + getVolume() +
                ", display=" + getDisplay();
    }
}