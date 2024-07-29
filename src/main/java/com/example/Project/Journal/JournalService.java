package com.example.Project.Journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class JournalService {
    private final JournalRepository journalRepository;

    @Autowired
    public JournalService(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }

    public List<Journal> getJournal() {
        return journalRepository.findAll();
    }

    public Journal addNewJournal(Map<String, String> journal) {
        String userID = journal.get("userID");
        String title = journal.get("title");
        String journalImage = journal.get("journalImage");
        String date = journal.get("date");
        String description = journal.get("description");
        Journal newJournal = new Journal(userID, journalImage, date, title, description);
        journalRepository.save(newJournal);
        return newJournal;
    }

    public boolean deleteJournal(long id) {
        if (!journalRepository.findById(id).equals(Optional.empty())) {
            journalRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Journal updateJournal(Long id, @RequestBody Map<String, String> journal) {
        Journal jo = journalRepository.findById(id).get();
        jo.setJournalTitle(journal.get("journalTitle"));
        jo.setJournalDescription(journal.get("journalDescription"));
        journalRepository.save(jo);
        return jo;
    }

    public List<Journal> getUserJournal(String userId) {
        return journalRepository.findByUserID(userId);
    }
}
