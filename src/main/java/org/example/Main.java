package org.example;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		CastToTypedMap castToTypedMap = new CastToTypedMap();

		System.out.println(castToTypedMap.getClass());
		System.out.println(castToTypedMap.getRawMap());
		System.out.println(castToTypedMap.toString());

	}

}
