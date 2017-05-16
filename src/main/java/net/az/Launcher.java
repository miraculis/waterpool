package net.az;

import net.az.impl.*;

import java.util.List;

/**
 * Hello world!
 */
public class Launcher {
    public static void main(String[] args) {
        Reader r = new SystemReader();
        Calculator<Integer[], Integer> c = new CalculatorImpl();
        Writer w = new SystemWriter();

        List<Integer> data;
        while((data = r.readNext()) != null) {
            w.write(c.compute(data.toArray(new Integer[1])));
        }
    }
}
