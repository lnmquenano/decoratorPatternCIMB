import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String news;

    public void subscribe(Subscriber s) {
        subscribers.add(s);
        System.out.println("Someone just subscribed.");
    }

    public void unsubscribe() {
        if (!subscribers.isEmpty()) {
            subscribers.remove(subscribers.size() - 1);
            System.out.println("Someone just unsubscribed.");
        } else {
            System.out.println("No subscribers to remove.");
        }
    }

    public int getSubscriberCount() {
        return subscribers.size();
    }

    public void updateBreakingNews(String updNews) {
        if (subscribers.isEmpty()) {
            System.out.println("No subscribers to notify.");
            return;
        }
        news = updNews;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber sub : subscribers) {
            sub.update(news);
        }
    }
}