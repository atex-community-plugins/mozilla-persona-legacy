package com.atex.plugins.persona.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void init(final ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
        throws ServletException, IOException {

        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    }

}
