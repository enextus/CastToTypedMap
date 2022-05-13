package org.example;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CastToTypedMapTests2 {

	@Test
	void testGetRawMap() {
		Map result = CastToTypedMap.getRawMap();
		assertEquals(Map.of("date 3", "1976-11-18"), Map.of("date 3", result.get("date 3").toString()));
	}

	@Test
	void testGetRawMapBig() {
		Map result = CastToTypedMap.getRawMapBig();
		assertEquals("1976-11-18", result.get("date 4").toString());
	}
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme