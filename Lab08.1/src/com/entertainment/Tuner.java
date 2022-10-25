/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.entertainment;

/**
 * The Tuner class handles some of the internal functionality that a Television uses.
 * It has the ability to get and set a channel (provided to the Tuner as a string).
 * Internally, it converts the channel to a "tuner frequency," which is an integer.
 *
 * This is the "complexity" associated with changing channels, and Tuner handles
 * (encapsulates) this complexity, so that a Television can use a Tuner without knowing
 * any of the details of channel changing.
 * We have introduced this "complexity" just to illustrate a point.
 *
 * NOTE: it is *not* a public class.
 * It is used only within the package (specifically by Television).
 */
class Tuner {
    private String channel = "Menu";
    private int station;  // internal tuner frequency for the named channel

    public void setChannel(String channel) {
        this.channel = channel;
        findStation(channel);
        goToStation();
    }

    public String getChannel() {
        return channel;
    }

    private void findStation(String channel) {
        station = Math.abs(channel.toUpperCase().hashCode());
    }

    private void goToStation() {
        System.out.println("Tuner - going to station: " + station);
    }
}