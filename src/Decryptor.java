public class Decryptor {

    private int numero_casas = 0;
    private String cifrado = null;
    private String token = null;
    private String decifrado = null;
    private String resumo_criptografico = null;
    private ReadFiletoJson objectJson = new ReadFiletoJson();
    private String alfabeto = "A/B/C/D/E/F/G/H/I/J/K/L/M/N/O/P/Q/R/S/T/U/V/W/X/Y/Z";

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

    public void decryptorMaker(){


    }
}

