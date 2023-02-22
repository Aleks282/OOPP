public class Radio {
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 50) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume50p() {
        int target = currentVolume * 3 / 2;
        setCurrentVolume(target);
    }

    public void setToMaxVolume() {
        currentVolume = 30;
    }
}
