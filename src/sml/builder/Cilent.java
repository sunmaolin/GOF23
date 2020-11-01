package sml.builder;

public class Cilent {
    public static void main(String[] args) {
        
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        houseDirector.constructHouse();

        houseDirector = new HouseDirector(new HighHouse());
        houseDirector.constructHouse();

    }
}
