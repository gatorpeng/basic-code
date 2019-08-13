package cn.itcast.day10.demo06;

public class Computer {

    public void powerOn() {
        System.out.println("Turn on the computer");
    }

    public void powerOff() {
        System.out.println("Shut down the computer.");
    }

    public void useDevice(USB usb){
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.keyIn();
        }

        usb.close();
    }

}
