# spring-cloud
1.一个服务注册中心，eureka_server,端口为8101
2.member-client工程跑了两个实例，端口分别为8102,8103，分别向服务注册中心注册
3.order-client端口为8104,向服务注册中心注册,并进行ribbon配置当order-client通过restTemplate调用member-client的hi接口时，
因为用ribbon进行了负载均衡，会轮流的调用member-client：8102和8103 两个端口的hi接口；
