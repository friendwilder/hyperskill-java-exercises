class Clock {

    int hours = 12;
    int minutes = 0;

    public void next() {
        this.minutes += 1;
        if (this.minutes == 60) {
            this.minutes = 0;
            this.hours += 1;
            if (this.hours == 13) {
                this.hours = 1;
            }
        }
    }
}