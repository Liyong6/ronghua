package cn.ronghuanet._01servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.ronghuanet.domain.User;
/**
 *	登录的servlet
 * 1. 写一个login.jsp   账号密码 提交数据到 后台的LoginServlet中
 * 2. 写一个LoginServlet 获取数据 ，比较数据 ， 跳转页面
 * @author EDY
 *
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 获取页面的值
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = new User(password, username);
		// 判断登录
		if("zs".equals(username)&&"123".equals(password)) {
			// 吧user放入session
			req.getSession().setAttribute("user", user);
			// 跳转页面 重定向
			resp.sendRedirect("http://www.baidu.com");
		}else {
			req.setAttribute("msg", "账号密码错误");
			// 跳转页面 请求转发
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
	}
}
