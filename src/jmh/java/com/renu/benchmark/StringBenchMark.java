package com.renu.benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Thread)

public class StringBenchMark {
    private static final int COUNT = 10000;
    @Benchmark
    public String stringConcat() {
        String result = "";
        for (int i = 0; i < COUNT; i++) {
            result += "x";
        }
        return result;
    }

    @Benchmark
    public String stringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < COUNT; i++) {
            sb.append("x");
        }
        return sb.toString();
    }

}
