package tv.providers;

import tv.Channel;
import tv.Show;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractChannel implements Channel {

    private final List<Show> shows = new ArrayList<>();

    void addShow(Show show) {
        shows.add(show);
    }

    @Override
    public List<Show> getShows() {
        return new ArrayList<>(shows);
    }

    @Override
    public String toString() {
        return getName();
    }

}
