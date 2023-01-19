package id.rdw.customexceptionresolver.resolver;

import id.rdw.customexceptionresolver.model.LogModel;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.handler.AbstractHandlerMethodExceptionResolver;
import org.apache.logging.log4j.Logger;

//THIS IS JUST AN EXAMPLE
@Component
public class NoHandlerFoundExceptionResolver extends AbstractHandlerMethodExceptionResolver {

    private static final Logger LOGGER = LogManager.getLogger(NoHandlerFoundExceptionResolver.class);
    @Override
    protected ModelAndView doResolveHandlerMethodException(HttpServletRequest request, HttpServletResponse response, HandlerMethod handlerMethod, Exception ex) {
        if (ex instanceof NoHandlerFoundException || ex instanceof HttpRequestMethodNotSupportedException)
        LOGGER.info(new LogModel(ex.getMessage()).toString());
        return null;
    }
}
