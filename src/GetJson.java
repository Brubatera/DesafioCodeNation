import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;

public class GetJson {

    private static HttpURLConnection con;

    public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException {

        FileWriter fr = null;
        JSONObject jsonObject = new JSONObject();
        String url = "https://api.codenation.dev/v1/challenge/dev-ps/generate-data?token=e9895bb76c916cd9abec54a75b3228a449d13d63\n";
        Decryptor contentC = new Decryptor();

//        try {
//
//            URL myurl = new URL(url);
//            con = (HttpURLConnection) myurl.openConnection();
//
//            con.setRequestMethod("GET");
//
//            StringBuilder content;
//
//            try (BufferedReader in = new BufferedReader(
//                    new InputStreamReader(con.getInputStream()))) {
//
//                String line;
//                content = new StringBuilder();
//
//                while ((line = in.readLine()) != null) {
//                    content.append(line);
//                    content.append(System.lineSeparator());
//                }
//
//                fr = new FileWriter("answer2.json");
//                fr.write(content.toString());
//                fr.close();
//            }
//
//
//        } finally {
//            con.disconnect();
//        }

        contentC.decryptorFunc();
    }
}