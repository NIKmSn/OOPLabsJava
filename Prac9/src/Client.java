public class Client {
    private int inn;
    private String name;

    public Client(String name, int inn) {
        this.name = name;
        this.inn = inn;
    }

    private boolean nameChecked(String name) {
        return this.name.equals(name);
    }

    public boolean clientChecked(String name, int inn) throws Exception {
        if (nameChecked(name)) {
            if (this.inn == inn) {
                return true;
            } else throw new Exception("ИНН клиента "+ name + " не совпадает с введенным.");
        } else throw new Exception("Не найден клиент с таким именем.");
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n\tИНН: " + inn;
    }
}
