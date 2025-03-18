package com.example.application.products;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;

//@Route(value = "products/new")
public class NewProductWithParam extends VerticalLayout implements HasUrlParameter<String> {

    @Override
    public void setParameter(BeforeEvent event, String parameter) {
        add(new H1(String.format("New Product View in Flow with param: '%s'", parameter)));
    }

}
