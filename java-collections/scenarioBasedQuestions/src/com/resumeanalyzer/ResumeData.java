package com.resumeanalyzer;

import java.util.List;

public class ResumeData {

    private String email;
    private String phone;
    private List<String> matchedKeywords;
    private int keywordCount;

    public ResumeData(String email, String phone, List<String> matchedKeywords) {
        this.email = email;
        this.phone = phone;
        this.matchedKeywords = matchedKeywords;
        this.keywordCount = matchedKeywords.size();
    }

    public String getEmail() {
        return email;
    }

    public int getKeywordCount() {
        return keywordCount;
    }

    @Override
    public String toString() {
        return "Email: " + email +
               ", Phone: " + phone +
               ", Keywords: " + matchedKeywords +
               ", Score: " + keywordCount;
    }
}
