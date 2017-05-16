package net.az.impl;

import net.az.Reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by miraculis on 16.05.2017.
 */
public class SystemReader implements Reader {
    private static final String stimulus = "enter height values:";

    private Scanner in = new Scanner(System.in);

    {
        System.out.println(stimulus);
    }

    @Override
    public List<Integer> readNext() {
        try {
            String s = in.nextLine();
            return Arrays.stream(s.split("\\s")).map(Integer::parseInt).collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        in.close();
    }
}
