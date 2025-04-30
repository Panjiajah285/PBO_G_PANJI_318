class Admin {
    String username;
    String password;

    public Admin() {
        username = "dmin123";
        password = "password123";
    }

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}