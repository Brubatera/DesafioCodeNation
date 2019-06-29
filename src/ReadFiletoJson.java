import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.server.ExportException;
import java.util.stream.Stream;

public class ReadFiletoJson {

    private String jsonString = null;
    private JSONObject jsonObject = null;
    private JSONObject writer = new JSONObject();

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public JSONObject getJsonObject() {
        StringBuilder contentBuilder = new StringBuilder();
        try (
                Stream<String> stream = Files.lines
                        (Paths.get("C:\\Users\\bruno\\IdeaProjects\\DesafioCodeNation\\answer.json"),
                                StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        jsonString = contentBuilder.toString();
        jsonObject = new JSONObject(jsonString);

        return jsonObject;
    }

    public void writeToAnswer(String decifrado, String resumo){
        jsonObject.put("decifrado", decifrado);
        jsonObject.put("resumo_criptografico", resumo);

        try(FileWriter file = new FileWriter("answer.json")){
            file.write(String.valueOf(jsonObject));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
