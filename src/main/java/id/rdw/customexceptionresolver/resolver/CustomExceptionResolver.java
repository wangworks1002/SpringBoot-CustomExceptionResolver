package id.rdw.customexceptionresolver.resolver;

import id.rdw.customexceptionresolver.exception.YourException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerMethodExceptionResolver;

@Component
public class CustomExceptionResolver extends AbstractHandlerMethodExceptionResolver {
    @Override
    protected ModelAndView doResolveHandlerMethodException(HttpServletRequest request, HttpServletResponse response, HandlerMethod handlerMethod, Exception ex) {
        if (ex instanceof YourException) {
            //Your Logic here
        }
        return null;
    }
}
