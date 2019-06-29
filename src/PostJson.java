import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PostJson {

    public void sendPost() throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost uploadFile = new HttpPost("https://api.codenation.dev/v1/challenge/dev-ps/submit-solution?token=e9895bb76c916cd9abec54a75b3228a449d13d63");
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addTextBody("field1", "yes", ContentType.MULTIPART_FORM_DATA);

// This attaches the file to the POST:
        File f = new File("C:\\Users\\bruno\\IdeaProjects\\DesafioCodeNation\\answer.json");
        builder.addBinaryBody(
                "answer",
                new FileInputStream(f),
                ContentType.APPLICATION_OCTET_STREAM,
                f.getName()
        );

        HttpEntity multipart = builder.build();
        uploadFile.setEntity(multipart);
        CloseableHttpResponse response = httpClient.execute(uploadFile);
        HttpEntity responseEntity = response.getEntity();

        System.out.println(responseEntity);
        System.out.println(response);
    }
}