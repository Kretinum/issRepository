package HiberPack;

public class HModerator {

    private String username;
    private String passwd;
    private Long ID;

    public HModerator(String username, String passwd, Long ID) {
        this.username = username;
        this.passwd = passwd;
        this.ID = ID;
    }

    public HModerator() {
    }

    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }

    public Long getID() {
        return ID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "HUser{" +
                "username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", ID=" + ID +
                '}';
    }

}
