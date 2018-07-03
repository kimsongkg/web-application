package com.prototype.webapplication.ui;

import com.prototype.webapplication.ui.view.MainViewDisplay;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

import javax.inject.Inject;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Kimsong San (k.san@gl-f.com) on 7/3/2018.
 */
@SpringUI
@Theme("prototype")
public class ApplicationUI extends UI {
  
  private MainViewDisplay mainViewDisplay;
  
  @Inject
  public ApplicationUI(MainViewDisplay mainViewDisplay) {
    this.mainViewDisplay = mainViewDisplay;
  }
  
  @Override
  protected void init(VaadinRequest vaadinRequest) {
    setContent(mainViewDisplay);
  }
}
