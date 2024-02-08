package engineering.nomore;

import org.openjdk.jmh.annotations.Benchmark;

public class BenchPress {

    @Benchmark
    public void test() {
        var a = 1 + 1;
    }
}
