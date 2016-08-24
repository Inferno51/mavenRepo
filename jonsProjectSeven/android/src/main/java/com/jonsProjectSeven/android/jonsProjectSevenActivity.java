package com.jonsProjectSeven.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.jonsProjectSeven.core.jonsProjectSeven;

public class jonsProjectSevenActivity extends GameActivity {

  @Override
  public void main(){
    PlayN.run(new jonsProjectSeven());
  }
}
