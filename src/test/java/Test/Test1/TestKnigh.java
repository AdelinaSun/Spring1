package Test.Test1;
import static org.mockito.Mockito.*;

import org.junit.Test;

import Spring.Classes.Knight;
import Spring.Interfaces.QuestInterface;

public class TestKnigh {

	@Test
	 public void knightShouldEmbarkQuest() {
	  QuestInterface mockQuest = mock(QuestInterface.class);
	  Knight knight = new Knight(mockQuest);
	  knight.embarkOnQuest();
	  verify(mockQuest, times(1)).embark();
	 }

	
	}
	

