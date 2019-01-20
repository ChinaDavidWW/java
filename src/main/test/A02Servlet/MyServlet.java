package A02Servlet;

import org.apache.ibatis.ognl.Token;

import javax.servlet.*;
import java.io.IOException;
import java.util.Map;

public class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {


    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();
        res.setCharacterEncoding("UTF-8");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
