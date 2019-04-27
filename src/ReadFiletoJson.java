import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFiletoJson {

    private String jsonString = null;
    private JSONObject jsonObject = null;

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
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        jsonString = contentBuilder.toString();
        jsonObject = new JSONObject(jsonString);

        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}
