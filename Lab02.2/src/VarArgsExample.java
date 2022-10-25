public class VarArgsExample {
    public static void main(String[] args) {
        myvarsMethod("sang", "daniel");
        myvarsMethod("sang", "daniel", "fred");
        myvarsMethod("sang", "daniel", "fred", "bryce");
        String[] array1 = {"daniel"};
        arrayMethod("sang", array1);
        String[] array2 = {"daniel", "fred"};
        arrayMethod("sang", array2);
        System.out.println("x");
        System.out.printf(" whatever %s", "sang");
        System.out.printf(" whatever %s %s", "sang", "fred");
        System.out.format(" whatever %s %s", "sang", "fred");
    }

    public static void myvarsMethod(Object... friends) {
        for (Object friend : friends) {
            System.out.print(friend + " ");
        }
        System.out.println();
    }

    private static void arrayMethod(String name, String[] friends) {
        for (String friend : friends) {
            System.out.print(friend + " ");
        }
        System.out.println();
    }
}
