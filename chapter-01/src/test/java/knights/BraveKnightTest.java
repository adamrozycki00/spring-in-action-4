package knights;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest quest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(quest);
        knight.embarkOnQuest();
        verify(quest, times(1)).embark();
    }

}
