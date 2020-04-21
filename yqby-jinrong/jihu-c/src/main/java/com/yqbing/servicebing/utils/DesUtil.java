package com.yqbing.servicebing.utils;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;




public class DesUtil {

	public static final String DES = "DES";

	public static final String DESede = "DESede";

	public static final String Blowfish = "Blowfish";

	// 默认加密Key
	public static final String KEY = "k34AAE4TAABMACA9";

	public static void main(String[] args) {
		// String key = UUID.randomUUID().toString() +
		// UUID.randomUUID().toString();//UUID.getUUID() + UUID.getUUID();
		// System.out.println(key.length());
		// key = key.substring(0, 48);
		// byte[] t = encryt("DESede", "你几号啊，呵呵",
		// key);
		//
		// String f = new BASE64Encoder().encode(t);
		// System.out.println(f);
		// try
		// {
		// t = new BASE64Decoder().decodeBuffer(f);
		// }
		// catch (IOException e) {
		// e.printStackTrace();
		// }
		// System.out.println(deEncryt("DESede", t, key));

		// String str ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
		// "<m><u uId=\"1\" lName=\"superman\" rName=\"superman2\" sex=\"1\" mobile=\"superman\" email=\"superman\"/><addr url=\"eruwioeuroiwe\"/></m>";

		// 自定义Key
		String str = "3";

		// String key = "1234567812345678";
		// String c = encrytWithBase64("DES", str, key);
		// System.out.println("" + c);
		// System.out.println(deEncrytWithBase64("DES", c, key));
		long t = System.currentTimeMillis();
		for (int i = 0; i < 1; i++) {
			// 默认Key
			String s = encrytWithBase64(str);
			System.out.println(s);
			System.out.println(deEncrytWithBase64(s));
		}
		System.out.println(System.currentTimeMillis() - t);

		System.out.println(deEncrytWithBase64("DcZTw+RZVA8="));
	}

	public static String encrytWithBase64(String Algorithm, String myinfo, String key) {
		byte[] keybyte = HexString2Bytes(key);

		byte[] str = encryt(Algorithm, myinfo, keybyte);

		return new BASE64Encoder().encode(str);
	}

	// 重构方法值使用默认参数-加密
	public static String encrytWithBase64(String myinfo) {
		byte[] keybyte = HexString2Bytes(KEY);

		byte[] str = encryt(DES, myinfo, keybyte);

		return new BASE64Encoder().encode(str);
	}

	public static String deEncrytWithBase64(String Algorithm, String myinfo, String key) {
		byte[] keybyte = HexString2Bytes(key);
		byte[] info = (byte[]) null;
		try {
			info = new BASE64Decoder().decodeBuffer(myinfo);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		String str = deEncryt(Algorithm, info, keybyte);
		return str;
	}

	// 重构方法值使用默认参数-解密
	public static String deEncrytWithBase64(String myinfo) {
		byte[] keybyte = HexString2Bytes(KEY);
		byte[] info = (byte[]) null;
		try {
			info = new BASE64Decoder().decodeBuffer(myinfo);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		String str = deEncryt(DES, info, keybyte);
		return str;
	}

	public static byte[] encryt(String Algorithm, String myinfo, String key) {
		byte[] keybyte = HexString2Bytes(key);

		byte[] str = encryt(Algorithm, myinfo, keybyte);

		return str;
	}

	public static String deEncryt(String Algorithm, byte[] myinfo, String key) {
		byte[] keybyte = HexString2Bytes(key);

		String str = deEncryt(Algorithm, myinfo, keybyte);
		return str;
	}

	private static byte[] encryt(String Algorithm, String myinfo, byte[] keybyte) {
		byte[] cipherByte = (byte[]) null;
		try {
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(1, deskey);
			cipherByte = c1.doFinal(myinfo.getBytes());
		}
		catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		}
		catch (NoSuchPaddingException e2) {
			e2.printStackTrace();
		}
		catch (Exception e3) {
			e3.printStackTrace();
		}
		return cipherByte;
	}

	private static String deEncryt(String Algorithm, byte[] cipherByte, byte[] keybyte) {
		byte[] clearByte = (byte[]) null;
		try {
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(2, deskey);
			clearByte = c1.doFinal(cipherByte);
		}
		catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		}
		catch (NoSuchPaddingException e2) {
			e2.printStackTrace();
		}
		catch (Exception e3) {
			e3.printStackTrace();
		}
		return new String(clearByte);
	}

	private static int parse(char c) {
		if (c >= 'a')
			return (c - 'a' + 10 & 0xF);
		if (c >= 'A')
			return (c - 'A' + 10 & 0xF);
		return (c - '0' & 0xF);
	}

	public static byte[] HexString2Bytes(String hexstr) {
		byte[] b = new byte[hexstr.length() / 2];
		int j = 0;
		for (int i = 0; i < b.length; ++i) {
			char c0 = hexstr.charAt(j++);
			char c1 = hexstr.charAt(j++);
			b[i] = (byte) (parse(c0) << 4 | parse(c1));
		}
		return b;
	}

	public static final String encodeHex(byte[] bytes) {
		StringBuffer buf = new StringBuffer(bytes.length * 2);

		for (int i = 0; i < bytes.length; ++i) {
			if ((bytes[i] & 0xFF) < 16) {
				buf.append("0");
			}
			buf.append(Long.toString(bytes[i] & 0xFF, 16));
		}
		return buf.toString();
	}
}
