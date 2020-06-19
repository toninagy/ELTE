package tv;

import java.util.List;

public interface Channel {
    List<Show> getShows();
    String getName();
    int getPrice();
}
