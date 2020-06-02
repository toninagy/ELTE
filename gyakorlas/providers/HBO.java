package tv.providers;

import tv.Show;

class HBO extends AbstractChannel {

    HBO() {
        addShow(new Show("Game of Thrones"));
        addShow(new Show("Westworld"));
    }

    @Override
    public String getName() {
        return "HBO";
    }

    @Override
    public int getPrice() {
        return 5;
    }

}