package com.ringo.servlet;

import com.ringo.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet("/f01")
public class FreeMarker01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("freemarker");
        req.setAttribute("msg",true);
        req.setAttribute("date",new Date());
        req.setAttribute("age",18);
        req.setAttribute("tax",0.43);
        req.setAttribute("msg1","hello eric");
        req.setAttribute("msg2","hello jack");
        String infos[]=new String[]{"china","usa","kora","russa"};
        req.setAttribute("infos",infos);

        List<String> list= Arrays.asList(infos);
        req.setAttribute("list",list);

        List<User> li=new ArrayList<>();
        li.add(new User(1,"jack"));
        li.add(new User(2,"alex"));
        li.add(new User(3,"eric"));
        req.setAttribute("li",li);

        Map maps=new HashMap();
        maps.put("1","shanghai");
        maps.put("2","shengzheng");
        maps.put("3","cq");
        req.setAttribute("maps",maps);
        req.getRequestDispatcher("template/f02.ftl").forward(req,resp);
    }
}

