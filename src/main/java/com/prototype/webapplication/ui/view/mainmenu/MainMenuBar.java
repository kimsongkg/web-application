package com.prototype.webapplication.ui.view.mainmenu;

import com.vaadin.server.ThemeResource;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;

import javax.inject.Inject;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Kimsong San (k.san@gl-f.com) on 7/3/2018.
 */
@SpringComponent
@UIScope
public class MainMenuBar extends MainMenuBarDesign {
  
  @Inject
  public MainMenuBar() {
    ThemeResource resource = new ThemeResource("prototype-logo.png");
    logo.setSource(resource);
    logo.addClickListener(e -> UI.getCurrent().getNavigator().navigateTo(""));
  
    menuItem.addItem("Welcome", (MenuBar.Command) selectedItem -> {
      getUI().getNavigator().navigateTo(UIScopePrototypeViews.WELCOME);
    });
    menuItem.addItem("Product", (MenuBar.Command) selectedItem -> {
      getUI().getNavigator().navigateTo(UIScopePrototypeViews.WELCOME);
    });
    menuProfile.addItem("Logout", (MenuBar.Command) selectedItem -> {
      getUI().getNavigator().navigateTo("");
    });
  }
}
