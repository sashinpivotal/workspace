/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

class Client {

    // you can run each of these independently, by uncommenting the one you want
    public static void main(String[] args) {
        // passByValue();
         passByReference();
    }

    private static void passByValue() {
        int x = 4;
        System.out.println("Client: before the call, x is " + x);

        // create Instructor and tell it to double my value
        Instructor instructor = new Instructor();
        instructor.doubleIt(x);

        System.out.println("Client: after the call, x is " + x);
    }

    private static void passByReference() {
        Marker m1 = new Marker("red");
        System.out.println("Client: before the call, the marker is " + m1.getColor());

        // create Instructor and tell it to write on board, with the Marker I pass in
        Instructor instructor = new Instructor();
        instructor.writeOnBoard(m1, "pass by reference");

        System.out.println("Client: after the call, the marker is " + m1.getColor());
    }
}