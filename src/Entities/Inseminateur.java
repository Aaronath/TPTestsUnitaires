package Entities;

public class Inseminateur extends Personne {
    private String login;
    private String password;

    public Inseminateur(String nom, String prenom, String telPortable, String login, String password) {
        super(nom, prenom, telPortable);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
