//package unicorndev.movies.config;
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.annotation.WebFilter;
//import org.springframework.stereotype.Component;
//import java.io.IOException;
//
//
//@Component
//@WebFilter("/*") // Optional: If you want to define a URL pattern for the filter
//public class CorsFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        // Initialization code
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//        HttpServletResponse httpResponse = (HttpServletResponse) response;
//
//        // Set CORS headers to allow requests from any origin
//        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
//        httpResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
//        httpResponse.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
//
//        // Continue the request processing
//        chain.doFilter(request, response);
//    }
//
//
//    @Override
//    public void destroy() {
//        // Cleanup code
//    }
//}
