package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value={
                    "'sqr range within acceptable values', 200, 300, 3",
                    "'sqr the upper limit of the range is greater than the maximum value', 200, 10000, 85",
                    "'sqr the range includes all possible values', 100, 9801, 90",
                    "'sqr range is less than acceptable values', 10, 99, 0",
                    "'sqr range to the minimum allowable value', 10, 100, 1",
                    "'sqr the range is greater than the maximum value', 9802, 10000, 0",
                    "'sqr the minimum border is less by 1 maximum is more by 1', 99, 9802, 90",
                    "'sqr minimum limit is more by 1 maximum is less by 1 than all admissible values', 101, 9800, 88"
            },
            delimiter=','
    )

    void shouldCounterSQRService(String test, int minLimit, int maxLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.counter(minLimit, maxLimit);
        assertEquals(expected, actual);
    }
}