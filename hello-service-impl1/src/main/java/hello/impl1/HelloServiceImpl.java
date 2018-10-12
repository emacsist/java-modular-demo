package hello.impl1;

public class HelloServiceImpl implements hello.HelloService {
    @Override
    public String say(final String world) {
        return "hello from impl1 => " + world;
    }
}
