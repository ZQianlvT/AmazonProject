package servlet;

import entity.User;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends BaseServlet {

    /**
     * 用户退出控制器
     *
     * @throws Exception
     */
    public void quitUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getSession().removeAttribute("currUser");
        uri = "/index.jsp";
        response.sendRedirect(request.getContextPath() + uri);
    }

    /**
     * 用户登录控制器
     *
     * @throws Exception
     */
    public void loginUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = new User();
        BeanUtils.populate(user, request.getParameterMap());
        boolean flag = userService.login(user);
        if (flag) {   //登录成功
            request.getSession().setAttribute("currUser", user);
            uri = "/index.jsp";
        } else {
            uri = "/login.jsp";
        }
        response.sendRedirect(request.getContextPath() + uri);
    }


    /**
     * 用户注册控制器
     *
     * @throws Exception
     */
    public void registerUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = new User();
        DateConverter dateConverter = new DateConverter(null);
        dateConverter.setPatterns(new String[]{"yyyy-MM-dd", "yyyy/MM/dd"});
        ConvertUtils.register(dateConverter, Date.class);
        BeanUtils.populate(user, request.getParameterMap());
        boolean flag = userService.register(user);
        System.out.println(user);
        if (flag) { //注册成功
            System.out.println("注册成功");
            request.getSession().setAttribute("currUser", user);
            uri = "/reg-result.jsp";
        } else {
            uri = "/register.jsp";
        }
        response.sendRedirect(request.getContextPath() + uri);
    }

    /**
     * 异步验证用户名是否存在
     *
     * @throws Exception
     */
    public void checkExist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter writer = response.getWriter();
        String username = request.getParameter("username");
        boolean flag = userService.isExistByName(username);
        if (flag) {
            writer.write("1");
        } else {
            writer.write("0");
        }
        writer.flush();
        writer.close();
    }

    /**
     * 异步验证验证码是否正确
     *
     * @throws Exception
     */
    public void checkValidateCode(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter writer = response.getWriter();
        String veryCode = request.getParameter("veryCode");
        String validateCode = (String) request.getSession().getAttribute("validateCode");
        if (veryCode == null || !veryCode.equals(validateCode)) {
            writer.write("0");
        } else {
            writer.write("1");
        }
        writer.flush();
        writer.close();
    }
}
