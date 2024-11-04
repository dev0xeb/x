package dairy.data.repositories;

import dairy.data.models.Entry;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImpl implements EntryRepository {
    private List<Entry> entries = new ArrayList<Entry>();
    private int count;
    @Override
    public void save(Entry entry) {
        entries.add(entry);
        count++;
    }

    @Override
    public Entry findById(String diaryId, int id) {
        for (Entry entry : entries) {
            if (entry.getDiaryId().equals(diaryId) && entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public Entry findByTitle(String diaryId, String title) {
        for (Entry entry : entries) {
            if (entry.getDiaryId().equals(diaryId) && entry.getTitle().equals(title)) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public List<Entry> findAll(String diaryId) {
        List<Entry> foundEntries = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry.getDiaryId().equals(diaryId)) {
                foundEntries.add(entry);
            }
        }
        return foundEntries;
    }

    @Override
    public void delete(String diaryId, int entryId) {
        for (int index = 0; index < entries.size(); index++) {
            Entry getEntry = entries.get(index);
            if (getEntry.getDiaryId().equals(diaryId) && getEntry.getId() == entryId) {
                entries.remove(index);
                count--;
            }
        }
    }

    @Override
    public LocalDateTime getDate(int entryId) {
        return null;
    }

    @Override
    public void update(String title, int id, String diaryId, String body) {
        for (Entry entry : entries) {
            if (entry.getDiaryId().equals(diaryId) && entry.getId() == id) {
                entry.setTitle(title);
                entry.setBody(body);
            }
        }
    }

    @Override
    public long numberOfEntries() {
        return count;
    }
}
