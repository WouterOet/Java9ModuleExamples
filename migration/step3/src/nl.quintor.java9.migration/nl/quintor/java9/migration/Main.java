package nl.quintor.java9.migration;

import nl.quintor.java9.external.SomeDependency;

public class Main {

    public static void main(String[] args) {
        new SomeDependency();
        System.out.println("Success");
    }
}
