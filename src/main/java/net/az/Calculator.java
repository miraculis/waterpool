package net.az;

/**
 * Created by miraculis on 16.05.2017.
 */
public interface Calculator<T, U> {
    U compute(T x);
}
