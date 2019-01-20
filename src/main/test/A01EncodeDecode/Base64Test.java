package A01EncodeDecode;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.hrms.util.security.Base64Util;
import com.hrms.util.security.Base64;
import com.auth0.jwt.algorithms.Algorithm;
import org.junit.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.locks.Lock;

public class Base64Test {
    @Test
    public void method() {
        String text = "字串文字";
        byte[] textByte = null;
        try {
            textByte = text.getBytes("UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //编码
        String encode = Base64.encode(textByte);
        System.out.println("编码后为：====" + encode);
        //解码
        byte[] decode = Base64.decode(encode);
        System.out.println("解码后为：====" + decode);
    }

    // 加密用的私钥
    private static String TOKEN_KEY = "keys";

    @Test
    public void method2() {
        String username = "锦邻驿站";
        String token = null;

        try {
            token = createToken(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("token为：  " + token);

        //==================================
        Map<String, Claim> stringClaimMap = null;
        try {
            stringClaimMap = vertifyToken(token);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("jwt.getClaims()==" + stringClaimMap);


    }


    public static String createToken(String username) throws Exception {
        // Token产生时间点
        Date startDate = new Date();

        // 设置过期时间
        Calendar now = Calendar.getInstance();
        now.add(Calendar.HOUR, 24);
        Date expireDate = now.getTime();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("alg", "HS256");
        map.put("typ", "JWT");
        String token = JWT.create()
                .withHeader(map)
                .withClaim("username", username)
                .withExpiresAt(expireDate)      // 过期时间
                .withIssuedAt(startDate)        // 签发时间
                .sign(Algorithm.HMAC256(TOKEN_KEY));        // 加密签名算法
        return token;
    }

    /**
     * 验证客户端token合法性
     *
     * @param token
     * @return 解码token，获得的claim对
     * @throws Exception
     */

    public static Map<String, Claim> vertifyToken(String token) throws Exception {
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_KEY)).build();
        DecodedJWT jwt = null;
        try {
            jwt = verifier.verify(token);
        } catch (Exception e) {
            throw new RuntimeException("token无效");
        }
        return jwt.getClaims();
    }

    @Test
    public void jdkBase64() {
        try {
            String src = "25d55ad283aa400af464c76d713c07ad";
            BASE64Encoder encoder = new BASE64Encoder();
            String encode = encoder.encode(src.getBytes());
            System.out.println("encode: " + encode);

            BASE64Decoder decoder = new BASE64Decoder();
            String decode = new String(decoder.decodeBuffer(encode));
            System.out.println("decode: " + decode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        List<String> qwer = Collections.singletonList("qwer");
        System.out.println(qwer);

    }


}
