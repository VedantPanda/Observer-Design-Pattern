package main.Publisher;

import main.Subscriber.Subscriber;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
}
