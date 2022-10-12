public class Data {
    private Data() {
    }

    public void logAndPass(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int len = login.length();
        if (len < 1 || len > 20) {
            throw new WrongLoginException("Введен неверный логин");
        }
        for (int i = 0; i < login.length(); i++) {
            char symbol = login.charAt(i);
            boolean isCharValid = (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z') ||
                    (symbol >= '0' && symbol <= '9') || symbol == '_';
            if (!isCharValid) {
                throw new WrongLoginException("Введен не верный логин");
            }
        }if (password.equals(confirmPassword)){
        int len1 = password.length();
        if (len1 < 1 || len1 > 20) {
            throw new WrongPasswordException("Введен неверный пароль");
        }
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isCharValid = (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z') ||
                    (symbol >= '0' && symbol <= '9') || symbol == '_';
            if (!isCharValid) {
                throw new WrongPasswordException("Введен не верный пароль");
            }
        }
        }else {
            System.out.println("Пароли не совпадают!");
        }

    }
}
