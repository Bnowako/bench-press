package engineering.nomore;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;


public class BenchPress {
    private static final KotlinExample kotlin = new KotlinExample();


    private static final String TEST_STRING = "a123431321382183218192389123891283982139321813282318u1238u8u91238u9123u88u91238u1238u91238u98u12381239891238921838u12389u21389u82139u8u92138u921389u8u912389u12389u3218u9823918u91238u91238u92138u982u1398u9123u892138u91238u9";


    @Benchmark
    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 2, time = 2500, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 2, time = 2500, timeUnit = TimeUnit.MILLISECONDS)
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
//    @BenchmarkMode({Mode.SingleShotTime})
    public void multipleReplaces() {
        kotlin.plainReplace(TEST_STRING);
    }

    @Benchmark
    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 2, time = 2500, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 2, time = 2500, timeUnit = TimeUnit.MILLISECONDS)
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void stringBuilderReplace() {
        kotlin.sbReplace(TEST_STRING);
    }

//    @Benchmark
//    @Fork(value = 1, warmups = 1)
//    @Warmup(iterations = 2, time = 2500, timeUnit = TimeUnit.MILLISECONDS)
//    @Measurement(iterations = 2, time = 2500, timeUnit = TimeUnit.MILLISECONDS)
//    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
//    @OutputTimeUnit(TimeUnit.MILLISECONDS)
//    public void charArray() {
//        kotlin.charrArrayReplace(TEST_STRING);
//    }

}
