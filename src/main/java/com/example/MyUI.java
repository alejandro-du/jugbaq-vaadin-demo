package com.example;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;

import javax.servlet.annotation.WebServlet;

public class MyUI extends UI {

    private UsuarioService service = new UsuarioService();

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Grid<Usuario> grid = new Grid<>(Usuario.class);
        grid.setItems(service.findAll());
        setContent(grid);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
