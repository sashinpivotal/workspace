import java.util.Arrays;

public class StringMethodsExample {

    public static void main(String[] args) {

        Computer[] computers = {
                new Computer("Sony"),
                new Computer("SamSung"),
                new Computer("LG")};

        findByBrand(computers, "SamSung");
        String volumeString = "34";
        int volume = Integer.parseInt(volumeString);
        System.out.println(volume);
    }

    public static void findByBrand(Computer[] computers,
                                   String brand) {

        boolean foundIt = false;

//        for (Computer computer : computers) {
//            if (computer.getBrand().equals(brand)) {
//                foundIt = true;
//                System.out.println("We found it " + brand);
//                break;
//            }
//        }

        int currentIndex = 0;
        while (foundIt == false) {
            if (computers[currentIndex++].getBrand().equals(brand)) {
                System.out.println("We found it " + brand);
                foundIt = true;
            }
        }
    }

}

class Computer {
    private String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

