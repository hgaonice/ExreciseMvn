package com.gaoh.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: GH
 * @Date: 2019/5/13 23:54
 * @Version 1.0
 */
public class MyFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init...");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        System.out.println("destroy...");
    }
}
