package dairy.data.repositories;

import dairy.data.models.Entry;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class EntryRepositoryImplTest {
    EntryRepositoryImpl entryRepository = new EntryRepositoryImpl();

    @BeforeEach
    public void setUp() {
        entryRepository = new EntryRepositoryImpl();
    }

    @Test
    public void testThatEntryRepositoryIsEmpty() {
        assertEquals(0, entryRepository.numberOfEntries());
    }

    @Test
    public void testToAddEntryNumberOfEntriesShouldBeOne() {
        Entry entry = new Entry("clinton",1, "firstTitle", "firstBody");
        entryRepository.save(entry);
        assertEquals(1, entryRepository.numberOfEntries());
    }

    @Test
    public void testAddNewEntryAndFindByTitleAndUsername() {
        Entry entry = new Entry("clinton",1, "firstTitle", "firstBody");
        entryRepository.save(entry);
        assertEquals(1, entryRepository.numberOfEntries());
        assertEquals("firstTitle", entryRepository.findById("clinton", 1).getTitle());
    }

    @Test
    public void testAdd2NewEntryFindById() {
        Entry entry = new Entry("clinton",1, "firstTitle", "firstBody");
        entryRepository.save(entry);
        assertEquals(1, entryRepository.numberOfEntries());
        Entry entry2 = new Entry("mate",2, "secondTitle", "secondBody");
        entryRepository.save(entry2);
        assertEquals(2, entryRepository.numberOfEntries());
        assertEquals("firstTitle", entryRepository.findById("clinton", 1 ).getTitle());
        assertEquals("secondTitle", entryRepository.findById("mate",2).getTitle());
    }

    @Test
    public void testSaveEntryAndFindByTitle() {
        Entry entry = new Entry("clinton",1, "firstTitle", "firstBody");
        entryRepository.save(entry);
        Entry entry2 = new Entry("mate",2, "secondTitle", "secondBody");
        entryRepository.save(entry2);
        assertEquals("secondBody", entryRepository.findByTitle("mate","secondTitle").getBody());
    }

    @Test
    public void testToFindAllEntriesInAParticularDiary() {
        Entry user1entry1 = new Entry("clinton",1, "firstTitle", "firstBody");
        Entry user1entry2 = new Entry("clinton", 2, "lol", "lolBody");
        Entry user2entry1 = new Entry("mate",1, "secondTitle", "firstBody");
        Entry user2entry2 = new Entry("mate",2, "lmao", "lmaoBody");
        entryRepository.save(user1entry1);
        entryRepository.save(user1entry2);
        entryRepository.save(user2entry1);
        entryRepository.save(user2entry2);
        assertEquals(2, entryRepository.findAll("clinton").size());
        assertEquals("firstTitle", entryRepository.findAll("clinton").getFirst().getTitle());
    }

    @Test
    public void testDeleteOneEntryOneIsRemaining(){
        Entry entry = new Entry("clinton",1, "firstTitle", "firstBody");
        entryRepository.save(entry);
        assertEquals(1, entryRepository.numberOfEntries());
        Entry entry2 = new Entry("mate",2, "secondTitle", "secondBody");
        entryRepository.save(entry2);
        assertEquals(2, entryRepository.numberOfEntries());
        entryRepository.delete("mate",2);
        assertEquals(1, entryRepository.numberOfEntries());
    }

    @Test
    public void testThatUserCanUpdateEntry(){
        Entry entry = new Entry("clinton",1, "firstTitle", "firstBody");
        entryRepository.save(entry);
        assertEquals(1, entryRepository.numberOfEntries());
        assertEquals("firstTitle", entryRepository.findById("clinton", 1).getTitle());
        entryRepository.update("clinton", 1, "newTitle", "newBody");
        assertEquals("newTitle", entryRepository.findById("clinton", 1).getTitle());
    }
}