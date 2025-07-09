package module_2.src.ss4_Lop_Va_Doi_Tuong;

public class demo {
    public static class TV {
        int channel = 1;
        int volumeLevel = 1;
        String status = "off";
        boolean on = false;

        public TV() {
        }

        public void turnOn() {
            status = "on";
            on = true;
        }

        public void turnOff() {
            status = "off";
            on = false;
        }

        public void setChannel(int newChannel) {
            if (on && newChannel >= 1 && newChannel <= 120)
                channel = newChannel;
        }

        public void setVolume(int newVolumeLevel) {
            if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
                volumeLevel = newVolumeLevel;
        }

        public void channelUp() {
            if (on && channel < 120)
                channel++;
        }

        public void channelDown() {
            if (on && channel > 1)
                channel--;
        }

        public void volumeUp() {
            if (on && volumeLevel < 7)
                volumeLevel++;
        }

        public void volumeDown() {
            if (on && volumeLevel > 1)
                volumeLevel--;
        }
    }

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(25);
        tv1.setVolume(5);
        tv1.channelUp();
        tv1.volumeUp();


        TV tv2 = new TV();
        tv2.turnOn();
        tv2.setChannel(21);
        tv2.channelDown();
        tv2.setVolume(5);
        tv2.volumeDown();
        tv2.turnOff();

        System.out.println("Status of tv1 is "+tv1.status+", tv1's channel: " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("Status of tv2 is "+tv2.status+", tv2's channel: " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
