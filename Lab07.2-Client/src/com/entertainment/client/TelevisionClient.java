/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;
import com.entertainment.util.Useful;

/**
 * Tester class, or "client" class, with main().
 * It creates a few instances of com.entertainment.Television and gives them a test-drive,
 * i.e., sets their properties and calls their methods.
 */
class TelevisionClient {

    // ENTRY-POINT or starting point for a standalone Java application
    public static void main(String[] args) {
        // Useful is a public class in another package - good, because I need to use it here
        Useful.help();

        System.out.println(Television.getInstanceCount() + " instances created");
        System.out.println();

        // create an instance of com.entertainment.Television, set its properties, then call methods on it
        // here, we use the no-arg ctor and set the properties individually, via the setters
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.OLED);
        tv1.turnOn();
        tv1.turnOff();
        System.out.println();

        // use the 3-arg brand-volume-display constructor
        Television tv2 = new Television("Sony", 50, DisplayType.PLASMA);
        tv2.turnOn();
        tv2.turnOff();
        System.out.println();

        // use the 1-arg brand constructor - volume will default to 0 and display to LED
        Television tv3 = new Television("LG");
        tv3.turnOn();
        tv3.turnOff();
        System.out.println();

        // try out their toString() methods
        System.out.println(tv1.toString());
        System.out.println(tv2);  // toString() automatically called
        System.out.println(tv3);
        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances created");
    }
}