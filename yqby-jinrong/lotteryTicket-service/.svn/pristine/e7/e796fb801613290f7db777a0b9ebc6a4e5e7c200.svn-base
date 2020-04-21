package com.yqbing.servicebing.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class DES {

	private static byte[] iv = { 1, 2, 3, 4, 5, 6, 7, 8 };

	private static byte[] KEY = new byte[] { 109, 101, 110, 117, 101, 107, 101, 121 };

	public static String encryptDES(String encryptString) throws Exception {
		IvParameterSpec zeroIv = new IvParameterSpec(iv);

		SecretKeySpec key = new SecretKeySpec(KEY, "DES");
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);
		byte[] encryptedData = cipher.doFinal(encryptString.getBytes());

		return Base64.encode(encryptedData);
	}

	public static String decryptDES(String decryptString) throws Exception {
		byte[] byteMi = Base64.decode(decryptString);
		IvParameterSpec zeroIv = new IvParameterSpec(iv);
		SecretKeySpec key = new SecretKeySpec(KEY, "DES");
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);
		byte decryptedData[] = cipher.doFinal(byteMi);

		return new String(decryptedData);
	}
}
