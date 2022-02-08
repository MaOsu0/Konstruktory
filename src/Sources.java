public class Sources {
    double water;
    double oil;

Sources (double waterSources, double oilSources){
    water = waterSources;
    oil = oilSources;
}

    void takeShower(){
    water = water - 48;
        System.out.println("Bierzemy prysznic");
        System.out.println(water +  " " + oil);
    }

    void takeBath() {
        water = water - 86;
        System.out.println("Bierzemy kąpiel");
        System.out.println(water +  " " + oil);
    }

    void makeDinner(){
    oil = oil - 0.1;
    water = water - 4;
        System.out.println("Gotujemy obiad");
        System.out.println(water +  " " + oil);
    }

    void boilWater(){
    oil = oil - 0.05;
    water = water - 0.5;
        System.out.println("Gotujemy wodę");
        System.out.println(water +  " " + oil);
    }

    void watchTv(int hour){
    oil = oil - (hour * 0.06);
        System.out.println("Oglądamy telewizję");
        System.out.println(water +  " " + oil);
    }

    String printSource (){
        return "Ilość wody to " + water + " litrów oraz ropy " + oil + " Litrów.";
    }

}
