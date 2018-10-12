package hello.impl2;

import hello.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String say(final String world) {
        return "hello from impl2 => " + world;
    }
}
