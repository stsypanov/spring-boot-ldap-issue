package example.benchmark;

import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class BenchmarkRunner {
  public static void main(String[] args) throws Exception {
    Options opt = new OptionsBuilder()
            .include(SpringBootStartUpBenchmark.class.getSimpleName())
            .warmupIterations(50)
            .measurementIterations(50)
            .forks(2) //0 makes debugging possible
            .shouldFailOnError(true)
//				.shouldDoGC(false)
//				.jvmArgsAppend(
//						"-Xint"
//						,
//						"-XX:+UnlockDiagnosticVMOptions",
//						"-XX:+PrintCompilation",
//						"-XX:+PrintInlining",
//						"-XX:+LogCompilation"
//				)
//            .addProfiler(GCProfiler.class)// memory and GC profiler
            .build();

    new Runner(opt).run();
  }
}
