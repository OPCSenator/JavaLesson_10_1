public class Radio {

    private final int maxSoundLevel = 100;
    private final int minChannelNumber = 0;
    private int countChannels = 10;
    private final int minSoundLevel = 0;

    public Radio() {
    }
    public Radio(int myCountChannels) {
        countChannels = myCountChannels;
    }


    private int currentChannel = 0;
    private int currentLoud = 0;

    public void setNextChannel() {
        if (currentChannel < countChannels - 1) {
            currentChannel++;
        } else {
            currentChannel = minChannelNumber;
        }

    }

    public void setPreviosChannel() {
        if (currentChannel > minChannelNumber) {
            currentChannel--;
        } else {
            currentChannel = countChannels - 1;
        }

    }


    public void setChannel(int myChannel) {
        if ((myChannel >= minChannelNumber) & (myChannel <= countChannels - 1)) {
            currentChannel = myChannel;
        }

    }

    public void setMoreLoud() {
        if (currentLoud < maxSoundLevel) {
            currentLoud++;
        }

    }

    public void setLessLoud() {
        if (currentLoud > minSoundLevel) {
            currentLoud--;}

    }

    public void setSoundLevel(int mySound) {
        if ((mySound >= minSoundLevel) & (mySound <= maxSoundLevel)) {
            currentLoud = mySound;
        }

    }

    public int getCurrentChannel() {
        return currentChannel;

    }

    public int getCurrentLoud() {
        return currentLoud;

    }


}
