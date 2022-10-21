package basic;

public class TV {
    public int channel;
    public int volume;
    public boolean power;

    public TV(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
        this.power = false;
    }

    public int getChannel() {
        if (isPower()) {
            return channel;
        }
        return 0;
    }

    public void setChannel(int channel) {
        if (isPower()) {
            this.channel = channel;
        }
    }

    public int getVolume() {
        if (isPower()) {
            return volume;
        }
        return 0;
    }

    public void setVolume(int volume) {
        if (isPower()){
            this.volume = volume;
        }
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setMute(){
        this.volume = 0;
    }
}
