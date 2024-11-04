package dairy.data.repositories;

import dairy.data.models.Entry;

import java.time.LocalDateTime;
import java.util.List;

public interface EntryRepository {
    void save(Entry entry);
    Entry findById(String diaryId, int id);
    Entry findByTitle(String diaryId,String title);
    List<Entry> findAll(String diaryId);
    void delete(String diaryId, int entryId);
    LocalDateTime getDate(int entryId);
    void update(String diaryId, int id, String title,  String body);
    long numberOfEntries();

}
