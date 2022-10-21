package Main;

import model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer(1,"type","200","test","company",1);
        System.out.println(  computer.toString());
    }
}
