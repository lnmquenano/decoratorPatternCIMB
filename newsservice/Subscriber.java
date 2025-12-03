public class Subscriber implements SubInterface {
    private int id;

    public Subscriber(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void update(String news) {
        System.out.println("Subscriber #" + id + " received: " + news);
    }
}