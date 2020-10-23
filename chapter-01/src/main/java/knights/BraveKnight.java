package knights;

import org.springframework.beans.factory.annotation.Autowired;

public class BraveKnight implements Knight {

    private final Quest quest;

    @Autowired
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
