package domain.objects;

import java.util.regex.Pattern;

public class User {
    private int id;
    private String username;
    private String email;
    private long documentId;

    public boolean checkEmail(){
        if (this.email == null) return false;
        // Basic regex for email validation
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(regex, this.email);
    }

    public boolean checkDoc() {
        return this.documentId>=10000000;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }
}
