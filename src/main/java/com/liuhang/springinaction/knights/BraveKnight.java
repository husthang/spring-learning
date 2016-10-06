/**
 * @author:liuhang
 * @date:2016年10月5日
 * @Description:TODO
 */
package com.liuhang.springinaction.knights;

import com.liuhang.springinaction.quest.Quest;

public class BraveKnight implements Knight{
  private Quest quest;
  
  public BraveKnight(Quest quest){
    this.quest=quest;
  }
  public void embarkOnQuest(){
    quest.embark();
  }  
}
