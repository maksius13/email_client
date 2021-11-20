package email_client;

import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Object> config = new YamlReader().read();
        String username = ((Map) ((Map) config.get("accounts")).get("yandex")).get("username").toString();
        String password = ((Map) ((Map) config.get("accounts")).get("yandex")).get("password").toString();

    }
}
