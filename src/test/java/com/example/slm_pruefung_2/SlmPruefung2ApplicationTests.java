package com.example.slm_pruefung_2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class SlmPruefung2ApplicationTests {

	@Test
	void testTime() {
		SlmPruefung2Application test = new SlmPruefung2Application();
		assertEquals("11 PM", test.time(23), "11 PM");
	}

	@Test
	void testInfo() {
		SlmPruefung2Application test = new SlmPruefung2Application();
		assertEquals(test.info(),"This API converts 24h time into AM/PM time","This API converts 24h time into AM/PM time");
	}
}
