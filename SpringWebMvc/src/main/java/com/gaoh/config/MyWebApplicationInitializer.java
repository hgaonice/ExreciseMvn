package com.gaoh.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Author: GH
 * @Date: 2019/5/23 23:03
 * @Version 1.0
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(WebConfig.class);
        webApplicationContext.refresh();

        DispatcherServlet ds = new DispatcherServlet(webApplicationContext);
//        ds.setContextClass();
//        ds.setContextConfigLocation();
//        ds.setNamespace();
//        ds.setThrowExceptionIfNoHandlerFound();
        ServletRegistration.Dynamic app = servletContext.addServlet("app", ds);
        app.setLoadOnStartup(1);
        app.addMapping("/app/*");
    }
}
/**
 * <web-app>
 *
 *     <listener>
 *         <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
 *     </listener>
 *
 *     <context-param>
 *         <param-name>contextConfigLocation</param-name>
 *         <param-value>/WEB-INF/app-context.xml</param-value>
 *     </context-param>
 *
 *     <servlet>
 *         <servlet-name>app</servlet-name>
 *         <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
 *         <init-param>
 *             <param-name>contextConfigLocation</param-name>
 *             <param-value></param-value>
 *         </init-param>
 *         <load-on-startup>1</load-on-startup>
 *     </servlet>
 *
 *     <servlet-mapping>
 *         <servlet-name>app</servlet-name>
 *         <url-pattern>/app/*</url-pattern>
 *     </servlet-mapping>
 *
 * </web-app>
 *
 *
 * DispatcherServlet  参数	说明
 * contextClass
 *
 * 实现ConfigurableWebApplicationContext，由此Servlet实例化和本地配置的类。默认情况下，XmlWebApplicationContext使用。
 *
 * contextConfigLocation
 *
 * 传递给上下文实例（由其指定contextClass）的字符串，用于指示可以在何处找到上下文。该字符串可能包含多个字符串（使用逗号作为分隔符）以支持多个上下文。对于具有两次定义的bean的多个上下文位置，最新位置优先。
 *
 * namespace
 *
 * 命名空间WebApplicationContext。默认为[servlet-name]-servlet。
 *
 * throwExceptionIfNoHandlerFound
 *
 * 是否NoHandlerFoundException在没有找到请求的处理程序时抛出。然后可以使用HandlerExceptionResolver（例如，通过使用 @ExceptionHandler控制器方法）捕获异常并像其他任何方法一样处理。
 *
 * 默认情况下，此设置为false，在这种情况下，DispatcherServlet将响应状态设置为404（NOT_FOUND）而不引发异常。
 *
 * 请注意，如果还配置了缺省servlet处理，则始终将未解析的请求转发到缺省servlet，并且永远不会引发404。
 */
