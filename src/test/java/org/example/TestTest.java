package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TestTest {

    @Test
    void test(){
        assertThat(2).isEqualTo(1+1);
    }
}
