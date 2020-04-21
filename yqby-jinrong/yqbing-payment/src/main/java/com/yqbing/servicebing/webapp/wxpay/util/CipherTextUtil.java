package com.yqbing.servicebing.webapp.wxpay.util;

import java.util.Base64;
import java.util.Base64.Decoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class CipherTextUtil {
	

	    /**
	     * 密钥算法
	     */
	    private static final String ALGORITHM = "AES";
	    /**
	     * 加解密算法
	     */
	    private static final String ALGORITHM_MODE_PADDING = "AES/ECB/PKCS5Padding";




	    public static byte[] decode(String key) throws Exception {
	    	Decoder decoder = Base64.getDecoder();
	    	byte[] result = decoder.decode(key);
	        return result;

	    }
	//根据商户密钥
	    private static SecretKeySpec key = new SecretKeySpec(MD5.MD5Encode("ijhustoreyqbing2018wxpaykaifazhe").toLowerCase().getBytes(), ALGORITHM);
	    
	    public static String decryptData(String base64Data) throws Exception {
	        Cipher cipher = Cipher.getInstance(ALGORITHM_MODE_PADDING);
	        cipher.init(Cipher.DECRYPT_MODE, key);
	        return new String(cipher.doFinal(decode(base64Data)),"UTF-8");
	    }

	public static void main(String[] args) {
		 String a = "m4NnwrtY0jhpDgNp65H1V/0OWMtSoTYhhY89MHbflhmnaHq9ZKjx9ABq6Jpg4SccA876HVy7J9P85NpdvCMNGInZ4fANDRE+YfZe4HeF+bbFj6JETcEFPpE9YW+bTbC0D+gl/otScJfvB2QUK7+EeBGPHN1EWX9zbr2Gw6AUaORdFk3mGxV5dtjuwWQrv5juzkXDs33Z2dUMslO+i3j0cTDHqwS4hptx2j6h2HvzgzltFbjo7nysU+4rArqJvrGW/9r18e1St9XgG21NALqixfaSmqetOR4zLVL4/+z3CEz8cg5r+/4GUOTf3XFmLCZ/wEkRQhKRNVibG0NFfiG3KnqArMJ/dheQHCd7qL+XX/ZV6tj8RLMgL7R6hOiR03Ljyikdxq9M3K9CTYgf03pHJd3geXX1LgXrLxc1flL6NW+zD3ZayGYpr1WpLsSMG7z8W5j1pme6cRj3n2+CwSFnOnOkxaFuLKoJAJIqM3gbC0eN++vY73RKphlI4zZqg6o5s3MXI6ju1yoi/ZQ+XbTg2JttsdbU0aySernKwkt0rYMf0j/Mcvo2axgHbI3w/iTm141WxHUjkQ+ga2X1pOWdGifGhSmMP8oGaA/WD5MAsK1qXX0eFvUWS/PTauCSTWq5Cmr8loA/KL3jgvB0nyR4mfccB+tPy4Ny7kzOlr/VNeb0ULf96R0AWFWCtdt8AmujAP0DYiM5FSmYLI0XRhpSDjnEbBM8+isNE1GlAVR3NzzemwQORihScovpAktbRSN/d3N+NgTjSoVDiJvCOxCs3thX9qt9iwYbA+/X/gv8lza2FZyIzwkQxGRcYl8JWKpXzNW8EWUNVnSLdHvQttDeV3CvgP/x579RGd6whyFYS6AaI0qw7oTjCFh2EHS/VzGvFuv166ZlVIJ4MNvg79O9h63ZOSE1LzVqEsVh8fDCfM2GgJ9aUdl95Djgunit4yIZOdoigR3f/BEHKrYCEham11rYohaAXs4XAXWihsV3WD5j4G/P+txvjAwujvf4HDwzHgFsmSml013U2mUiy+v4zw==";
	        try {
				String B = decryptData(a);
				System.out.println(B);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	}
}
