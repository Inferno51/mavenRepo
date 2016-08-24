package com.jonsProjectSeven.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import com.jonsProjectSeven.core.jonsProjectSeven;

public class jonsProjectSevenHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform.Config config = new HtmlPlatform.Config();
    // use config to customize the HTML platform, if needed
    HtmlPlatform platform = HtmlPlatform.register(config);
    platform.assets().setPathPrefix("jonsProjectSeven/");
    PlayN.run(new jonsProjectSeven());
  }
}
