package com.bvan.oop.hw.lesson4.messenger;

import java.time.LocalDateTime;

/**
 * @author bvanchuhov
 */
public class MessengerRunner {

    public static void main(String[] args) {
        String taras = "Taras";
        String anna = "Anna";

        LocalDateTime time = LocalDateTime.now();

        Dialog dialog = new Dialog();
        dialog.addMessage(new Message(taras, new PlainText("How are you?"), time));
        dialog.addMessage(new Message(anna, new PlainText("I'm fine"), time));

        dialog.addMessage(new Message(anna, new EmoticonText("winking-face"), time));
        dialog.addMessage(new Message(taras, new EmoticonText("ghost"), time));
        dialog.addMessage(new Message(taras, new EmoticonText("Bu-ga-ga"), time));

        dialog.addMessage(new Message(anna, new PictureText("like"), time));
        dialog.addMessage(new Message(taras, new PictureText("heart"), time));

        System.out.println(dialog.show());
    }
}

// OUTPUT:
// How are you?
// by Taras, 2018-04-19T16:34:41.820
//
// I'm fine
// by Anna, 2018-04-19T16:34:41.820
//
// 😉
// by Anna, 2018-04-19T16:34:41.820
//
// 👻
// by Taras, 2018-04-19T16:34:41.820
//
// <unknown emoticon>
// by Taras, 2018-04-19T16:34:41.820
//
// ________$$$$
// _______$$__$
// _______$___$$
// _______$___$$
// _______$$___$$
// ________$____$$
// ________$$____$$$
// _________$$_____$$
// _________$$______$$
// __________$_______$$
// ____$$$$$$$________$$
// __$$$_______________$$$$$$
// _$$____$$$$____________$$$
// _$___$$$__$$$____________$$
// _$$________$$$____________$
// __$$____$$$$$$____________$
// __$$$$$$$____$$___________$
// __$$_______$$$$___________$
// ___$$$$$$$$$__$$_________$$
// ____$________$$$$_____$$$$
// ____$$____$$$$$$____$$$$$$
// _____$$$$$$____$$__$$
// _______$_____$$$_$$$
// ________$$$$$$$$$$
//
// by Anna, 2018-04-19T16:34:41.820
//
// ________$$$$$$$$$$$___________$$$$$$$$$$$$_________
// ______$$$$$$$$_____$$$$$___$$$$$$_____$$$$$$$______
// ____$$$$$$$_____________$$$______________$$$$$_____
// ___$$$$$$$_______________$_________________$$$$____
// __$$$$$$____________________________________$$$$___
// __$$$$$_____________________________________ $$$$__
// _$$$$$______________________________________$$$$$__
// _$$$$$_____________________________________$$$$$$__
// __$$$$$$_________________________________$$$$$$$___
// ___$$$$$$$______________________________$$$$$$$____
// _____$$$$$$____________________________$$$$$$______
// _______$$$$$$________________________$$$$$$________
// __________$$$$$_____________________$$$$___________
// _____________$$$$_________________$$$$_____________
// _______________$$$$_____________$$$________________
// _________________$$$_________$$$___________________
// _________________ __$$$_____$$_____________________
// ______________________$$__$$_______________________
// ________________________$$_________________________
//
// by Taras, 2018-04-19T16:34:41.820
