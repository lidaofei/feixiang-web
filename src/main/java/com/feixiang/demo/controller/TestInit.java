package com.feixiang.demo.controller;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class TestInit extends HttpServlet{
    @Override
    public void init() throws ServletException{
        System.out.println("TestInit println");
    }

}
