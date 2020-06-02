package tv.providers;

import tv.Show;

class Starz extends AbstractChannel {

    Starz() {
        addShow(new Show("Outlander"));
        addShow(new Show("Battlestar Galactica"));
    }

    @Override
    public String getName() {
        return "Starz";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}