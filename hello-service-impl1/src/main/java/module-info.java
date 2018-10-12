module hello.service.impl1 {
    requires hello.service;
    provides hello.HelloService with hello.impl1.HelloServiceImpl;
}