package com.example.Project.Journal;

import jakarta.persistence.*;

@Entity
@Table
public class Journal {
    @Id
    @SequenceGenerator(
            name = "journal_generator",
            sequenceName = "journal_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "journal_generator"
    )
    private long journalID;

    private String userID;
    private String journalImage;
    private String date;
    private String journalTitle;
    private String journalDescription;

    public Journal() {
    }

    public Journal(long journalID, String userID, String journalTitle, String journalDescription) {
        this.journalID = journalID;
        this.userID = userID;
        this.journalTitle = journalTitle;
        this.journalDescription = journalDescription;
    }

    public Journal(String userID, String journalTitle, String journalDescription) {
        this.userID = userID;
        this.journalTitle = journalTitle;
        this.journalDescription = journalDescription;
    }

    public Journal(String userID, String journalImage,  String date, String journalTitle, String journalDescription) {
        this.journalImage = journalImage;
        this.userID = userID;
        this.date = date;
        this.journalTitle = journalTitle;
        this.journalDescription = journalDescription;
    }

    public Journal(String userID, String journalImage, String journalTitle, String journalDescription) {
        this.journalImage = journalImage;
        this.journalTitle = journalTitle;
        this.journalDescription = journalDescription;
        this.userID = userID;
    }

    public Journal(String journalTitle, String journalDescription) {
        this.journalTitle = journalTitle;
        this.journalDescription = journalDescription;
    }

    public long getJournalID() {
        return journalID;
    }

    public void setJournalID(long journalID) {
        this.journalID = journalID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    public String getJournalDescription() {
        return journalDescription;
    }

    public void setJournalDescription(String journalDescription) {
        this.journalDescription = journalDescription;
    }

    public String getImgURl() {
        return journalImage;
    }

    public void setImgURl(String journalImage) {
        this.journalImage = journalImage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
