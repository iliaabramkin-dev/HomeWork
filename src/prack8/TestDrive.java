package prack8;

public class TestDrive {
    public static void main(String[] args) {
        BoundedWaitList<String> content = new BoundedWaitList<>(5);

        String s = "Str_0";
        content.add(s);
        for (int i = 1; i < 10; i++) {
            content.add("Str_" + i);
        }

        System.out.println(content);
        System.out.println(content);
    }
}
