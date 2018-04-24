package filter;

import service.impl.TypeServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebFilter(filterName = "TypeFilter", urlPatterns = "/index.jsp")
public class TypeFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        try {
            HttpServletRequest request = (HttpServletRequest) req;
            if (request.getSession().getAttribute("parentTypeList") == null) {
                List<Map<String, Object>> parentTypeList = new TypeServiceImpl().getParentTypeList();
                request.getSession().setAttribute("parentTypeList", parentTypeList);
            }
            chain.doFilter(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
