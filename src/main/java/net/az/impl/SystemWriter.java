package net.az.impl;

import net.az.Writer;

/**
 * Created by miraculis on 16.05.2017.
 */
public class SystemWriter implements Writer {
    @Override
    public void write(Integer x) {
        System.out.println(String.format("total collected volume is %d", x));
    }
}
