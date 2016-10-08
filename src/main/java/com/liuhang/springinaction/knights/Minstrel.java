/**
 * @author:liuhang
 * @date:2016年10月8日
 * @Description:吟游诗人 记录骑士的探险任务，类似日志系统
 */
package com.liuhang.springinaction.knights;

import java.io.PrintStream;

public class Minstrel {
  private PrintStream stream;
  public Minstrel(PrintStream stream){
    this.stream=stream;
  }
  public void singBeforeQuest(){
    stream.println("Before quest");
  }
  public void singAfterQuest(){
    stream.println("After quest");
  }

}
