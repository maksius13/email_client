package email_client;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class YamlReader {
    public Map<String, Object> read() throws IOException {
        InputStream in = Files.newInputStream(Paths.get("src/main/resources/config.yml"));
        Yaml yaml = new Yaml();
        return (Map<String, Object>) yaml.load(in);
    }
}
