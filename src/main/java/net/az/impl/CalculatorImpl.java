package net.az.impl;

import net.az.Calculator;

/**
 * Created by miraculis on 16.05.2017.
 */
public class CalculatorImpl implements Calculator<Integer[], Integer> {
    @Override
    public Integer compute(Integer[] h) {
        int l = 0, r = h.length - 1, lm = 0, rm = 0, lv = 0, rv = 0, v = lv + rv;
        boolean zl = false, zr = false;

        while (l < r) {
            int lh = h[l], rh = h[r];

            lm = Math.max(lm, lh);
            rm = Math.max(rm, rh);

            if (h[l] == 0) {zl = true;lm = 0; lv = 0;}
            if (h[r] == 0) {zr = true;rm = 0; rv = 0;}

            if (isMax(h, l)) { zl = false; v += lv; lv = 0;}
            if (isMax(h, r)) { zr = false; v += rv; rv = 0;}

            if (lm <= rm) {
                if (!zl) lv += lm - h[l];
                l++;
            } else {
                if (!zr) rv += rm - h[r];
                r--;
            }
        }

        return v + lv + rv;
    }

    private Integer getHeight(Integer[] h, int index) {
        if (index == -1 || index == h.length) return 0; else return h[index];
    }

    private boolean isMax(Integer[] h, int index) {
        Integer h1 = getHeight(h, index-1), h2 = getHeight(h, index), h3 = getHeight(h, index+1);
        return h2.compareTo(h1) > 0 && h2.compareTo(h3) > 0;
    }
}
