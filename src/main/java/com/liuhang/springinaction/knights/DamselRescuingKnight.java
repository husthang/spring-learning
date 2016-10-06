/**
 * @author:liuhang
 * @date:2016年10月5日
 * @Description:执行少女拯救探险的骑士，实现一般骑士的接口
 */
package com.liuhang.springinaction.knights;

import com.liuhang.springinaction.quest.RescueDamselQuest;

public class DamselRescuingKnight implements Knight {
  private RescueDamselQuest quest;

  /**
   * 此处，DamselRescuingKnight与RescueDamselQuset紧耦合
   * 此骑士只能用于拯救少女，限制了其复用能力
   * 此骑士的单元测试不易
   */
  public DamselRescuingKnight() {
    this.quest = new RescueDamselQuest();
  }

  public void embarkOnQuest() {
    System.out.println("the knight is rescuing the damsel");
    quest.embark();
  }

}
