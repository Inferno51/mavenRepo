package com.jonsProjectSeven.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import com.jonsProjectSeven.core.jonsProjectSeven;

public class jonsProjectSevenJava {

  public static void main(String[] args) {
    JavaPlatform.Config config = new JavaPlatform.Config();
    // use config to customize the Java platform, if needed
    JavaPlatform.register(config);
    PlayN.run(new jonsProjectSeven());
  }
}
