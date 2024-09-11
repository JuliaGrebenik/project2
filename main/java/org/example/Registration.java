package org.example;

public class Registration {

    private String Email;
    private String Username;
    private String Password;


    public void setEmail(String Email) {
        this.Email = Email;
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getEmail() {
        return Email;
    }
    public String getUsername() {
        return Username;
    }
    public String getPassword() {
        return Password;
    }

    public static void main(String[] args) {

        Registration r=new Registration();
        r.setEmail("user@yahoo.com");
        r.setUsername("user123");
        r.setPassword("123456");

        System.out.println("Email: "+r.getEmail());
        System.out.println("Username: "+r.getUsername());
        System.out.println("Password: "+r.getPassword());

    }
}

