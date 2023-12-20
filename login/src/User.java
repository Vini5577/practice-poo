public class User {

    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void singIN(String user, String password) {
        setUser(user.trim());
        setPassword(password.trim());
        if (getPassword().length() > 12 || getPassword().length() < 6) {
            throw new RuntimeException("A senha precisa ter no minimo 6 e no máximo 12 caracteres");
        }

        System.out.println("Cadastro realizado com sucesso!");
    }

    public void login(String user, String password) {
        if (!getUser().equalsIgnoreCase(user) || !getPassword().equalsIgnoreCase(password)) {
            throw new RuntimeException("Error: Usúario Invalido");
        }

        System.out.println("Login feito com sucesso!");
    }

}