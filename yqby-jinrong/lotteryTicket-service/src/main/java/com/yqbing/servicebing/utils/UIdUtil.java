package com.yqbing.servicebing.utils;

import java.util.UUID;

public class UIdUtil {

	public static void main(String[] args) {
		// UUID uuid = UUID.randomUUID();
		// System.out.println(uuid);
		// int a = uuid.toString().indexOf("-");
		// int b = uuid.toString().indexOf("-", a + 1);
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(getUUIdLastPart());
	}

	public static String getUUIdPart() {
		UUID uuid = UUID.randomUUID();
		int a = uuid.toString().indexOf("-") + 1;
		return uuid.toString().substring(a, uuid.toString().indexOf("-", a));
	}

	public static String getUUIdFirstPart() {
		UUID uuid = UUID.randomUUID();
		System.out.println("getUUIdFirstPart:" + uuid);
		int a = uuid.toString().indexOf("-") + 1;
		return uuid.toString().substring(0, a - 1);
	}

	public static String getUUIdLastPart() {
		UUID uuid = UUID.randomUUID();
		System.out.println("getUUIdLastPart:" + uuid);
		int a = uuid.toString().lastIndexOf("-") + 1;
		return uuid.toString().substring(a, uuid.toString().length());
	}
}
