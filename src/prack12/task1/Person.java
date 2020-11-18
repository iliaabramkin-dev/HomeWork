package prack12.task1;

public class Person {
    private String name;
    private String lastname;
    private String patronymic;

    public Person(String lastname, String name, String patronymic) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
    }

    public String getFIO () {
        StringBuilder builder = new StringBuilder();
        builder.append(lastname).append(' ');
        if (name != null && name.length() != 0) {
            builder.append(name.toUpperCase().charAt(0))
                    .append('.');
        }
        if (patronymic != null && patronymic.length() != 0) {
            builder.append(patronymic.toUpperCase().charAt(0))
                    .append('.');;
        }
        return builder.toString();
    }
}
