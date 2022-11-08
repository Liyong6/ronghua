package cn.ronghuanet._01servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/test"},initParams = {@WebInitParam(name="key",value="value")})
public class TestServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 获取 ServletContext对象
		// 方式一： 直接从父类中拿到上下文对象
		ServletContext application1 = super.getServletContext();
		// 方式二： 从servletConfig中拿
		ServletContext application2 = super.getServletConfig().getServletContext();
		// 方式三： 从request中拿
		ServletContext application3 = req.getServletContext();
		// 方式四： 从session中获取
		ServletContext application4 = req.getSession().getServletContext();
		
		System.out.println("application1:" + application1);
		System.out.println("application2:" + application2);
		System.out.println("application3:" + application3);
		System.out.println("application4:" + application4);

		/*
		 *	 1-2.种 都差不多 
		 *	 3 .种 是从请求中拿  比较简单 但是兼容不好他不兼容tomcat 7 以前的版本
		 *	 4 .种 麻烦一点 但是兼容好
		 */
		String contextPath = application1.getContextPath();
		System.out.println("上下文路径：" + contextPath);
		
		String realPath = application1.getRealPath("/");
		System.out.println("真实路径：" + realPath);
		
		String initParameter = application1.getInitParameter("ckey");
		System.out.println("initParameter：" + initParameter);
	}
}
