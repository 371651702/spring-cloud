package com.xinhui.wdl.config.client.controller;

/**
 * @author dongliang.wang
 * @createTime 2019/7/1
 **/
public class DocumentTest {
    /**
     * org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'testController': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'hello' in value "${hello}"
     * 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:380) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1411) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:592) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:515) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:320) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.support.AbstractBeanFactory$$Lambda$135/1239807799.getObject(Unknown Source) ~[na:na]
     * 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:318) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:845) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:877) ~[spring-context-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:549) ~[spring-context-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:140) ~[spring-boot-2.1.6.RELEASE.jar:2.1.6.RELEASE]
     * 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:742) [spring-boot-2.1.6.RELEASE.jar:2.1.6.RELEASE]
     * 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:389) [spring-boot-2.1.6.RELEASE.jar:2.1.6.RELEASE]
     * 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:311) [spring-boot-2.1.6.RELEASE.jar:2.1.6.RELEASE]
     * 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1213) [spring-boot-2.1.6.RELEASE.jar:2.1.6.RELEASE]
     * 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1202) [spring-boot-2.1.6.RELEASE.jar:2.1.6.RELEASE]
     * 	at com.xinhui.wdl.config.client.ConfigClientApplication.main(ConfigClientApplication.java:14) [classes/:na]
     * Caused by: java.lang.IllegalArgumentException: Could not resolve placeholder 'hello' in value "${hello}"
     * 	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:178) ~[spring-core-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:124) ~[spring-core-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:237) ~[spring-core-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:211) ~[spring-core-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer.lambda$processProperties$0(PropertySourcesPlaceholderConfigurer.java:175) ~[spring-context-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer$$Lambda$169/159475521.resolveStringValue(Unknown Source) ~[na:na]
     * 	at org.springframework.beans.factory.support.AbstractBeanFactory.resolveEmbeddedValue(AbstractBeanFactory.java:851) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1192) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1171) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:593) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:90) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:374) ~[spring-beans-5.1.8.RELEASE.jar:5.1.8.RELEASE]
     * 	... 18 common frames omitted
     *
     *
     * Process finished with exit code 1
     */
}
