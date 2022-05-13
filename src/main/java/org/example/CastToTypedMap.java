package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class CastToTypedMap {
	public static Map getRawMap() {

		Map rawMap = new HashMap();
		rawMap.put("date 1", LocalDate.of(2021, Month.FEBRUARY, 10));
		rawMap.put("date 2", LocalDate.of(1992, Month.AUGUST, 8));
		rawMap.put("date 3", LocalDate.of(1976, Month.NOVEMBER, 18));
		return rawMap;
	}

	public static Map getRawMapBig() {

		Map rawMap = new HashMap();
		rawMap.put("date 4", LocalDate.of(1976, Month.NOVEMBER, 18));
		rawMap.put("date 5", LocalDate.of(1976, Month.NOVEMBER, 18));
		rawMap.put("date 6", LocalDate.of(1976, Month.NOVEMBER, 18));
		return rawMap;
	}

}
