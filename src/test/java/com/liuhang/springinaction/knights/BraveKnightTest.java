/**
 * @author:liuhang
 * @date:2016年10月5日
 * @Description:TODO
 */
package com.liuhang.springinaction.knights;

import org.junit.Test;
import static org.mockito.Mockito.*;

import com.liuhang.springinaction.quest.Quest;


public class BraveKnightTest {
  @Test
  public void knightShouldEmbarkOnQuest() {
    Quest mockQuest = mock(Quest.class);
    BraveKnight knight = new BraveKnight(mockQuest);
    knight.embarkOnQuest();
    verify(mockQuest, times(1)).embark();
  }

}
