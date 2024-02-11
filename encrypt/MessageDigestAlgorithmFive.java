package encrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author QianZhenHua
 */

public class MessageDigestAlgorithmFive {

    public static String generateMD5(String inputstring) {
        try {
            // 为MD5创建一个MessageDigest实例
            MessageDigest md5 = MessageDigest.getInstance("MD5");

            // 将输入字符串转换为字节数组
            byte[] inputBytes = inputstring.getBytes();

            // 使用输入字节更新MessageDigest
            md5.update(inputBytes);

            // 计算MD5哈希，并将其作为十六进制字符串返回
            byte[] digest = md5.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            // 如果MD5算法不可用，则处理异常
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String input = "This is the string to be hashed.";
        String md5Hash = generateMD5(input);
        System.out.println("MD5 hash of '" + input + "': " + md5Hash);
    }
}
