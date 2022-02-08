public class Home {
    public static void main(String[] args) {

        Sources home1 = new Sources(1000,1000);
        home1.takeShower();
        home1.takeBath();
        home1.makeDinner();
        home1.boilWater();

        System.out.println(home1.printSource());
    }
}
