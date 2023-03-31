package br.com.ricas.service;

import br.com.ricas.domain.service.impl.ExtractScoreServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ExtractScoreServiceTest {

    @Test
    public void shouldExtractScoreSuccessfully() {
        var extract = new ExtractScoreServiceImpl();
        int[] result = extract.extractScores("2-3");
        assertEquals(result[0], 2);
        assertEquals(result[1], 3);
    }
}
