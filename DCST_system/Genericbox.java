
class GenericBox<T> {

    private T data;

    public GenericBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void display() {
        System.out.println("Stored value: " + data);
    }
}

class GenericUtility {

    public static <T> void displayList(T[] items) {

        for (T item : items) {
            System.out.println(item);
        }
    }
}
