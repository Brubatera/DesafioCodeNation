import java.math.BigInteger;
import java.security.MessageDigest;

public class ResumoCript {

    private String resumo = null;

    public String geraResumo(String decifrado) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(decifrado.getBytes("utf8"));
            resumo = String.format("%040x", new BigInteger(1, digest.digest()));

            System.out.println(resumo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resumo;
    }
}
