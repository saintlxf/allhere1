package com.ht.allhere.controller;

import com.baidu.ueditor.ActionEnter;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/ueditor")
public class UEditorCtrl {

    @RequestMapping("/back")
    public void back(HttpServletRequest request,HttpServletResponse response){

        response.setHeader("Content-Type" , "text/html");
        String rootPath=request.getSession().getServletContext().getRealPath("/");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.write(new ActionEnter(request,rootPath).exec());
    }
}
