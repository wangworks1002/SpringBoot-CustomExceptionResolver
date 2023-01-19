package id.rdw.customexceptionresolver.configuration;

import id.rdw.customexceptionresolver.resolver.CustomExceptionResolver;
import id.rdw.customexceptionresolver.resolver.NoHandlerFoundExceptionResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfiguration implements WebMvcConfigurer {

    private final CustomExceptionResolver customExceptionResolver;
    private final NoHandlerFoundExceptionResolver noHandlerFoundExceptionResolver;

    @Autowired
    public AppConfiguration(
            CustomExceptionResolver customExceptionResolver,
            NoHandlerFoundExceptionResolver noHandlerFoundExceptionResolver
    ) {
        this.customExceptionResolver = customExceptionResolver;
        this.noHandlerFoundExceptionResolver = noHandlerFoundExceptionResolver;
    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        resolvers.add(
                (HandlerExceptionResolver) Arrays.asList(
                        customExceptionResolver,
                        noHandlerFoundExceptionResolver
                )
        );
        WebMvcConfigurer.super.configureHandlerExceptionResolvers(resolvers);
    }
}
