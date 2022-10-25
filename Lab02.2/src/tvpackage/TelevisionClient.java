package tvpackage;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
//        tv1.brand = "SamSung";
//        tv1.volume = 32;
        tv1.setBrand("SamSung");
        tv1.setVolume(100);
        int volume = tv1.getVolume();

    }
}
