import javax.xml.stream.events.Characters;
import java.util.Arrays;

public class Decryptor {

    private int numero_casas = 0;
    private String cifrado = null;
    private String token = null;
    private String decifrado = null;
    private String resumo_criptografico = null;
    private ReadFiletoJson objectJson = new ReadFiletoJson();

    public int getNumero_casas() {
        return objectJson.getJsonObject().getInt("numero_casas");
    }

    public void setNumero_casas(int numero_casas) {
        this.numero_casas = numero_casas;
    }

    public String getCifrado() {
        return cifrado = objectJson.getJsonObject().getString("cifrado");
    }

    public void setCifrado(String cifrado) {
        this.cifrado = cifrado;
    }

    public void decryptorFunc() {

        char[] cifradoT = getCifrado().toCharArray();

        int count = getNumero_casas();

        for (int i = 0; i < cifradoT.length; i++) {
            Character character = cifradoT[i];
            if (character != ' ' && character != ',' && character != '.') {
                cifradoT[i] = (char) ((cifradoT[i] - 'a' + 26 - count) % 26 + 'a');
                new String(cifradoT);
            }
        }

        System.out.println(cifradoT);
    }

    public void insertContent() {
        objectJson.getJsonObject().put("decifrado", decifrado);
    }
}

