package com.example.application.products;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.WildcardParameter;

//@Route(value = "products")
public class FlowProductWildcardView extends VerticalLayout implements HasUrlParameter<String> {

    @Override
    public void setParameter(BeforeEvent beforeEvent, @WildcardParameter String s) {
        add(new H1("Wildcard Product View in Flow, parameter: " + s));
    }
}
