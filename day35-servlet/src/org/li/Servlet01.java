package org.li;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form")
public class Servlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("这是doGET");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        System.out.println("这是doPost");
        System.out.println(request.getParameter("username"));
        String html = "<!DOCTYPE html><html><head><meta charset=\\\"UTF-8\\\"><title>Insert title here</title></head><body>访问成功~~</body></html>";


        PrintWriter writer = response.getWriter();
        writer.write(html);

    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("这是service");
//    }
}
