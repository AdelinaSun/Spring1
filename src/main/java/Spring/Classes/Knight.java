package Spring.Classes;

import Spring.Interfaces.KnightInterface;
import Spring.Interfaces.QuestInterface;

public class Knight implements KnightInterface {
	private QuestInterface quest;

	public Knight(QuestInterface quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		System.out.println("Рыцарь.embarkOnQuest");
		quest.embark();
	}

}
