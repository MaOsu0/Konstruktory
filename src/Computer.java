public class Computer {
    String procesor;
    int memory;

    Computer(String proc, int mem){
        procesor = proc;
        memory = mem;
    }

    void printInfo(){
        System.out.println(procesor + " " + memory);
    }


}
