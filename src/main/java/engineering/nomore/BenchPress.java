package engineering.nomore;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

import static engineering.nomore.KotlinExampleKt.kotlinCode;

public class BenchPress {

    @Benchmark
    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 1, time = 5000, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 1, time = 5000, timeUnit = TimeUnit.MILLISECONDS)
    @BenchmarkMode(Mode.Throughput)
    public void test() {
        var a = 1 + 1;
    }


    @Benchmark
    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 1, time = 5000, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 1, time = 5000, timeUnit = TimeUnit.MILLISECONDS)
    @BenchmarkMode(Mode.Throughput)
    public void testKotlinCode() {
        kotlinCode();
    }


}
