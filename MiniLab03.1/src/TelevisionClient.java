/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

public class TelevisionClient {

    public static void main(String[] args) {
        Television tv1 = new Television("Sony", 50);
        System.out.println(tv1);

        Television tv2 = new Television("RCA", 10);
        System.out.println(tv2);

        System.out.println();

        // is tv1 affected by the fact that tv2's volume is 10?
        System.out.println("first tv1" + tv1);

        Television tv3 = new Television("RCA", 300);
        System.out.println("second tv1" + tv1);
        System.out.println("second tv2" + tv2);
        System.out.println("second tv3" + tv3);
    }
}