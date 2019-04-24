import org.json.JSONObject;

import java.io.*;
import java.net.*;

public class GetJson {

    private static HttpURLConnection con;

    public static void main(String[] args) throws MalformedURLException,
            ProtocolException, IOException {

        int numero_casas = 0;
        String cifrado = null;
        String token = null;
        String decifrado = null;
        String resumo_criptografico = null;
        String json = null;
        String url = "https://api.codenation.dev/v1/challenge/dev-ps/generate-data?token=e9895bb76c916cd9abec54a75b3228a449d13d63";
        JSONObject jsonObject = null;

        try {

            URL myurl = new URL(url);
            con = (HttpURLConnection) myurl.openConnection();

            con.setRequestMethod("GET");

            StringBuilder content;

            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {

                String line;
                content = new StringBuilder();

                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }

            json = content.toString();

            jsonObject = new JSONObject(json);

            numero_casas = (int) jsonObject.get("numero_casas");
            token = (String) jsonObject.get("token");
            cifrado = (String) jsonObject.get("cifrado");
            decifrado = (String) jsonObject.get("decifrado");
            resumo_criptografico = (String) jsonObject.get("resumo_criptografico");

        } finally {
            con.disconnect();
        }
    }
}