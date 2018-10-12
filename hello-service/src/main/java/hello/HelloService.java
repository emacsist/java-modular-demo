package hello;

import java.util.ServiceLoader;

public interface HelloService {
    String say(String world);

    static Iterable<HelloService> getService() {
        return ServiceLoader.load(HelloService.class);
    }
}
