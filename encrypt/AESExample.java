package encrypt;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

public class AESExample {
    public static void main(String[] args) throws Exception {
        // 生成密钥
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // 可以是 128, 192 或 256
        SecretKey secretKey = keyGenerator.generateKey();

        // 转换密钥
        byte[] keyBytes = secretKey.getEncoded();
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");

        // 初始化 Cipher 用于加密
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding"); // 使用 CBC 模式和 PKCS5Padding 填充方案
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

        // 待加密的字符串
        String inputString = "Hello, World!";
        byte[] inputBytes = inputString.getBytes();

        // 加密
        byte[] encryptedBytes = cipher.doFinal(inputBytes);
        String encryptedBase64 = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("加密后的字符串（Base64 编码）: " + encryptedBase64);

        // 初始化 Cipher 用于解密
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

        // 解密
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedBase64));
        String decryptedString = new String(decryptedBytes);
        System.out.println("解密后的字符串: " + decryptedString);
    }
}
