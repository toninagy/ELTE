package tv;

import java.io.OutputStream;

public interface TvShow {
    void watch(OutputStream outputStream);
    boolean isSubscribed();
    void subscribe() throws InsufficientFundsException;
    Channel getChannel();
    String getTitle();
}
