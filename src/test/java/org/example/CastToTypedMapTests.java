package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CastToTypedMapTests {

	@Test
	public void testGetRawMap() {
		Map<String, LocalDate> result = CastToTypedMap.getRawMap();
		assertEquals(result.get("date 2"), LocalDate.of(1992, Month.AUGUST, 8));
	}

	@Test
	public void testGetRawMapBig() {
		Map<String, LocalDate> result = CastToTypedMap.getRawMapBig();
		assertEquals(result.get("date 6"), LocalDate.of(1976, Month.NOVEMBER, 18));
	}

	@Test
	public void givenRawMap_whenCastToTypedMap_shouldHaveCompilerWarning() {

		Map<String, LocalDate> castFromRawMap = (Map<String, LocalDate>) CastToTypedMap.getRawMap();

		System.out.println(CastToTypedMap.getRawMap());
		System.out.println(CastToTypedMap.getRawMap() instanceof Map);
		System.out.println(CastToTypedMap.getRawMap().getClass());
		System.out.println("-------------\n");
		System.out.println(castFromRawMap);
		System.out.println(castFromRawMap.getClass());
		System.out.println(castFromRawMap instanceof HashMap);
		System.out.println("-------------\n");

		for (Map.Entry<String, LocalDate> entry : castFromRawMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}

		assertEquals(3, castFromRawMap.size());
		assertEquals(castFromRawMap.get("date 2"), LocalDate.of(1992, Month.AUGUST, 8));
	}
}
