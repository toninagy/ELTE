package tv.providers;

import tv.Show;

class Showtime extends AbstractChannel {

    Showtime() {
        addShow(new Show("Shameless"));
    }

    @Override
    public String getName() {
        return "Showtime";
    }

    @Override
    public int getPrice() {
        return 7;
    }

}