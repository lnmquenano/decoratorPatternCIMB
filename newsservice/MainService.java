import java.util.Scanner;

public class MainService {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            NewsAgency agency = new NewsAgency();

            int nextID = 1;

            while (true) {
                System.out.println("\nNEWS SERVICE:");
                System.out.println("1 - Subscribe");
                System.out.println("2 - Unsubscribe");
                System.out.println("3 - Notify Subscribers");
                System.out.println("4 - Show Total Current Subscribers");
                System.out.println("5 - Exit");
                System.out.print("Choose: ");
                String choice = scan.nextLine();

                switch (choice) {
                    case "1" -> {
                        Subscriber subs = new Subscriber(nextID++);
                        agency.subscribe(subs);
                    }

                    case "2" -> {
                        agency.unsubscribe();
                    }

                    case "3" -> {
                        agency.updateBreakingNews("BREAKING NEWS: SUPER TYPHOON INCOMING");
                        }

                    case "4" -> System.out.println("Total subscribers: " + agency.getSubscriberCount());

                    case "5" -> {
                        System.out.println("Exiting...");
                        return;
                    }

                    default -> System.out.println("Invalid choice.");
                }
            }
        } 
    }
}