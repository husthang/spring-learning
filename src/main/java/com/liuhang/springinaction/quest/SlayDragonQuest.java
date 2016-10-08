/**
 * @author:liuhang
 * @date:2016年10月8日
 * @Description:TODO
 */
package com.liuhang.springinaction.quest;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest{
  private PrintStream stream;
  public SlayDragonQuest(PrintStream stream){
    this.stream=stream;
  }
  public void embark(){
    stream.println("SlayDragonQuest");
  }
}
