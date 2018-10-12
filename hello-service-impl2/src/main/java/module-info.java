module hello.service.impl2 {
    requires hello.service;
    provides hello.HelloService with hello.impl2.HelloServiceImpl;
}