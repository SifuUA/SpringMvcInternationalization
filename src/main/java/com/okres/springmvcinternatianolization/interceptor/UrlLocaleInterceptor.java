package com.okres.springmvcinternatianolization.interceptor;

import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by Alex on 30.07.2017.
 */
public class UrlLocaleInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);

        if (localeResolver == null){
            throw new IllegalStateException("No LocaleResolver found: not in a DispatcherServlet request?");
        }

        Locale locale = localeResolver.resolveLocale(request);

        localeResolver.setLocale(request,response,locale);

        return true;
    }
}
