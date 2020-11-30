package cyberdeck.kirama;

import cyberdeck.Cyberdeck;

public class KiramaDriver {

    public static void main(String[] args) {
        Cyberdeck kiri = new Kirama();
        System.out.println("Rolling 1d6: " + kiri.roll(1, 6));
        System.out.println("Rolling 3d6: " + kiri.roll(3, 6));

        System.out.println("Rolling 1d20: " + kiri.roll(1, 20));
        System.out.println("Rolling 1d43: " + kiri.roll(1, 43));
    } //main

} //KiramaDriver
