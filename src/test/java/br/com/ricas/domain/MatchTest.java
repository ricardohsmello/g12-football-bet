package br.com.ricas.domain;

 import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

 import java.time.LocalDate;
 import java.time.LocalDateTime;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class MatchTest {
    @Test
    public void test() {

        System.out.println(LocalDate.now());
    }
}
