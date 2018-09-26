package example.benchmark;

import example.AppConfig;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class SpringBootStartUpBenchmark {

  private ConfigurableApplicationContext context;

  @Benchmark
  public Object loadContext() {
    context = SpringApplication.run(AppConfig.class);
    return context;
  }

  @TearDown
  public void closeContext(){
    SpringApplication.exit(context);
  }
}
