package com.okres.springmvcinternatianolization.resolver;

import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by Alex on 30.07.2017.
 */
public class UrlLocaleResolver implements LocaleResolver{

    private static final String URL_LOCALE_ATTRIBUTE_NAME = "URL_LOCALE_ATTRIBUTE_NAME";

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String uri = request.getRequestURI();

        System.out.println("URI= " + uri);

        String prefixEn = request.getServletContext().getContextPath() + "/en/";
        String prefixRu = request.getServletContext().getContextPath() + "/ru/";
        String prefixUa = request.getServletContext().getContextPath() + "/ua/";

        Locale locale = null;

        if (uri.startsWith(prefixEn)){
            locale = Locale.ENGLISH;
        }else if (uri.startsWith(prefixRu)){
            locale = new Locale("ru", "RU");
        }else if (uri.startsWith(prefixUa)){
            locale = new Locale("ua", "UA");
        }

        if (locale != null){
            request.getSession().setAttribute(URL_LOCALE_ATTRIBUTE_NAME, locale);
        }

        if (locale == null){
            locale = (Locale) request.getSession().getAttribute(URL_LOCALE_ATTRIBUTE_NAME);
            if (locale == null){
                locale = Locale.ENGLISH;
            }
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
