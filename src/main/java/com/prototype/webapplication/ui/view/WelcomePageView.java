package com.prototype.webapplication.ui.view;

import com.prototype.webapplication.ui.view.mainmenu.UIScopePrototypeViews;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Kimsong San (k.san@gl-f.com) on 7/3/2018.
 */
@SpringComponent
@UIScope
@SpringView(name = UIScopePrototypeViews.WELCOME)
public class WelcomePageView extends WelcomePageViewDesign implements View {

}
