/**
 * @author:liuhang
 * @date:2016年10月5日
 * @Description:TODO
 */
package com.liuhang.spring.di.knights;

import com.liuhang.spring.di.quest.Quest;

public class BraveKnight implements Knight{
  private Quest quest;
  
  public BraveKnight(Quest quest){
    this.quest=quest;
  }
  public void embarkOnQuest(){
    quest.embark();
  }  
}
