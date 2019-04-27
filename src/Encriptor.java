public class Encriptor {

    private int numero_casas = 0;
    private String cifrado = null;
    private String token = null;
    private String decifrado = null;
    private String resumo_criptografico = null;
    private ReadFiletoJson objectJson = null;

    public Encriptor(int numero_casas, String cifrado, String token, String decifrado, String resumo_criptografico) {
        this.numero_casas = numero_casas;
        this.cifrado = cifrado;
        this.token = token;
        this.decifrado = decifrado;
        this.resumo_criptografico = resumo_criptografico;

        numero_casas = objectJson.getJsonObject().getInt("numero_casas");
        cifrado = objectJson.getJsonObject().getString("cifrado");
    }

    char[] letra = null;
//        char c = 'c';
//        c = cifrado.charAt(0);
//        String alfabeto = "A/B/C/D/E/F/G/H/I/J/K/L/M/N/O/P/Q/R/S/T/U/V/W/X/Y/Z";
//        String[] array = alfabeto.split("/");
}

