/*
Program Name: Zodiac Sign Finder
Description: This Program finds the User's Zodiac Sign and Characteristics Based On their Birthday
@author (Luke Patrick Llanto Vasuqez - B05210002)
@version 1.15
 */
package question5;

import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.net.*;

public class Question5 {

    public static void main(String[] args) throws Exception {
        boolean repeat;
        String name;
        String DOB;
        String b1;
        String Zodiac = "";
        String Characteristic = "";
        int year = 0;
        int rep = 0;
        int LifePath = 0;
        int leapyear = 0;
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        int currentmonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentdate = Calendar.getInstance().get(Calendar.DATE);
        int date = 0;
        int maxdate;
        int month = 0;

        ImageIcon icon = new ImageIcon();
        //Name Getter
        do {
            do {
                repeat = false;
                name = JOptionPane.showInputDialog(null, "Please Input Your First Name", "Input", JOptionPane.QUESTION_MESSAGE);
                if (!name.matches("^[a-zA-Z]*$")) {

                    JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
            } while (repeat == true);

            //Get Honorific Title
            String HonorName = Honorific.Desig();

            //Get DOB
            do {
                do {
                    repeat = false;
                    b1 = JOptionPane.showInputDialog(null, "Please Input YEAR Of Birth In NUMBERS. (e.g. 20XX)", "Input", JOptionPane.QUESTION_MESSAGE);
                    if (b1 == null) {
                        int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                        if (a02 == 0) {
                            System.exit(0);
                        } else {
                            repeat = true;
                        }
                    }

                } while (repeat == true);

                try {
                    year = Integer.parseInt(b1);
                    repeat = false;
                    if (year > currentyear) {
                        JOptionPane.showMessageDialog(null, "Selected Year Cannot Be Greater Than Current Year", "Error", JOptionPane.ERROR_MESSAGE);
                        repeat = true;
                    }
                    if (year < 1970) {
                        JOptionPane.showMessageDialog(null, "Selected Year Cannot Be Lesser Than The Year 1970", "Error", JOptionPane.ERROR_MESSAGE);
                        repeat = true;
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
            } while (repeat
                    == true);

            do {
                do {
                    repeat = false;
                    b1 = JOptionPane.showInputDialog(null, "Please Input MONTH Of Birth In NUMBERS. (e.g. 9 or 11)", "Input", JOptionPane.QUESTION_MESSAGE);
                    if (b1 == null) {
                        int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                        if (a02 == 0) {
                            System.exit(0);
                        } else {
                            repeat = true;
                        }
                    }

                } while (repeat == true);

                try {
                    month = Integer.parseInt(b1);
                    repeat = false;

                    if (month > currentmonth && year == currentyear && month < 13) {
                        JOptionPane.showMessageDialog(null, "Selected Month Cannot Be Greater Than Current Month", "Error", JOptionPane.ERROR_MESSAGE);
                        repeat = true;
                    }
                    if (month > 12 && month > currentmonth) {
                        JOptionPane.showMessageDialog(null, "Selected Month Cannot Be Greater Than 12, Which Is December", "Error", JOptionPane.ERROR_MESSAGE);
                        repeat = true;
                    }
                    if (month <= 0) {
                        JOptionPane.showMessageDialog(null, "Selected Month Cannot Be Lesser Than 1, Which Is January", "Error", JOptionPane.ERROR_MESSAGE);
                        repeat = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
            } while (repeat
                    == true);

            do {
                do {
                    repeat = false;
                    b1 = JOptionPane.showInputDialog(null, "Please Input DATE Of Birth In NUMBERS. (e.g. 12 or 22)", "Input", JOptionPane.QUESTION_MESSAGE);
                    if (b1 == null) {
                        int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                        if (a02 == 0) {
                            System.exit(0);
                        } else {
                            repeat = true;
                        }
                    }

                } while (repeat == true);

                try {
                    date = Integer.parseInt(b1);
                    repeat = false;

                    if (year == 1972 || year == 1976 || year == 1980 || year == 1984 || year == 1988 || year == 1992 || year == 1996 || year == 2000 || year == 2004
                            || year == 2008 || year == 2012 || year == 2016 || year == 2020) {

                        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                            maxdate = 31;
                            if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date > maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + " , As The" + month + "th Month Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date < 1) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                            maxdate = 30;
                            if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date > maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + " , As The" + month + "th Month Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date < 1) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                        } else if (month == 2) {
                            maxdate = 29;
                            if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date > maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + ", As The " + month + "th Month On The Year "
                                        + year + " Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date < 1) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }

                        }

                    } else if (year != 1972 || year != 1976 || year != 1980 || year != 1984 || year != 1988 || year != 1992 || year != 1996 || year != 2000 || year != 2004
                            || year != 2008 || year != 2012 || year != 2016 || year != 2020) {

                        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                            maxdate = 31;
                            if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date > maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + " , As The" + month + "th Month Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date < 1) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                            maxdate = 30;
                            if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date > maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + " , As The" + month + "th Month Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date < 1) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                        } else if (month == 2) {
                            maxdate = 28;
                            if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date > maxdate) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + ", As The " + month + "th Month On The Year "
                                        + year + " Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }
                            if (date < 1) {
                                JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                                repeat = true;
                            }

                        }

                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
            } while (repeat
                    == true);

            //Get Age
            int age = currentyear - year;
            //Zodiac Finder
            if ((month == 3 && date >= 21) || (month == 4 && date <= 20)) {
                Zodiac = "Aries";
                Characteristic = "Your Characteristics : \nAries (March 21 – April 20)\nThe first sign of the zodiac, Aries loves to be number one. Naturally,"
                        + " this dynamic fire sign is no stranger to competition. \nBold and ambitious, Aries dives headfirst into even the most challenging situations—and they'll make sure they always come out on top!";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6YxVWfofuYi3Yz8UVuufSIN89hdX-0TqonA&usqp=CAU"));

            }
            if ((month == 4 && date >= 21) || (month == 5 && date <= 21)) {
                Zodiac = "Taurus";
                Characteristic = "Your Characteristics : \nTaurus (April 21 - May 21)\n"
                        + "What sign is more likely to take a six-hour bath, followed by a luxurious Swedish massage and decadent dessert spread? Why Taurus, of course! "
                        + "\nTaurus is an earth sign represented by the bull. Like their celestial spirit animal, Taureans enjoy relaxing in serene, bucolic environments surrounded by soft sounds, soothing aromas, and succulent flavors.";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTW8fGZLquXMmXg0_vCw5BsUWg5_7yw8jBHXfjiUYESHaelNh4MjFalskEPGXkCBaHwrWg&usqp=CAU"));
            }
            if ((month == 5 && date >= 22) || (month == 6 && date <= 21)) {
                Zodiac = "Gemini";
                Characteristic = "Your Characteristics : \nGemini (May 22 - June 21)\n"
                        + "Have you ever been so busy that you wished you could clone yourself just to get everything done? "
                        + "That's the Gemini experience in a nutshell. \nSpontaneous, playful, and adorably erratic, Gemini is driven by its insatiable curiosity. "
                        + "\nAppropriately symbolized by the celestial twins, this air sign was interested in so many pursuits that it had to double itself. You know, NBD!";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR9Fu1KKniu-qd7N1dtZqJuqI9qnYMUdw7oNt3wKg-fr32gaCzauK6SeB2rRbvNSU5n9Vk&usqp=CAU"));

            }
            if ((month == 6 && date >= 22) || (month == 7 && date <= 22)) {
                Zodiac = "Cancer";
                Characteristic = "Your Characteristics : \nCancer (June 22 - July 22)\n"
                        + "Represented by the crab, Cancer seamlessly weaves between the sea and shore representing Cancer’s ability to exist in both emotional and material realms. "
                        + "\nCancers are highly intuitive and their psychic abilities manifest in tangible spaces. But—just like the hard-shelled crustaceans—this water sign is willing to do whatever it takes to protect itself emotionally. "
                        + "\nIn order to get to know this sign, you're going to need to establish trust!";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuileqxzdSzJFbv-LMPdmMKC46CAjCiYqFAT56vMEZfkxXQVgXnyWdBnIzP5SFd_7TIwM&usqp=CAU"));
            }
            if ((month == 7 && date >= 23) || (month == 8 && date <= 22)) {
                Zodiac = "Leo";
                Characteristic = "Your Characteristics : \nLeo (July 23 - August 22)\n"
                        + "Roll out the red carpet because Leo has arrived. Passionate, loyal, and infamously dramatic, "
                        + "\nLeo is represented by the lion and these spirited fire signs are the kings and queens of the celestial jungle. "
                        + "\nThey're delighted to embrace their royal status: Vivacious, theatrical, and fiery, Leos love to bask in the spotlight and celebrate… well, themselves.";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuileqxzdSzJFbv-LMPdmMKC46CAjCiYqFAT56vMEZfkxXQVgXnyWdBnIzP5SFd_7TIwM&usqp=CAU"));
            }
            if ((month == 8 && date >= 23) || (month == 9 && date <= 22)) {
                Zodiac = "Virgo";
                Characteristic = "Your Characteristics : \nVirgo (August 23 - September 22)\n"
                        + "You know the expression, \"if you want something done, give it to a busy person?\" Well, that definitely is the Virgo anthem. "
                        + "\nVirgos are logical, practical, and systematic in their approach to life. "
                        + "\nVirgo is an earth sign historically represented by the goddess of wheat and agriculture, an association that speaks to Virgo's deep-rooted presence in the material world. "
                        + "\nThis earth sign is a perfectionist at heart and isn’t afraid to improve skills through diligent and consistent practice.";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSwd2lMBI0RniIMr4DGdR30LLe7qeqPO9a4ZscYqWi9jTQLTVRsRrc3tABKhlSZ97SjaU&usqp=CAU"));
            }
            if ((month == 9 && date >= 23) || (month == 10 && date <= 22)) {
                Zodiac = "Libra";
                Characteristic = "Your Characteristics : \nLibra (September 23 - October 22)\n"
                        + "Balance, harmony, and justice define Libra energy. As a cardinal air sign, Libra is represented by the scales (interestingly, the only inanimate object of the zodiac), "
                        + "\nan association that reflects Libra's fixation on establishing equilibrium. Libra is obsessed with symmetry and strives to create equilibrium in all areas of life — "
                        + "\nespecially when it comes to matters of the heart.";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvI4tvAZ2I_3pyj7jGZWAeIKsvrQ-NPVc6CQ&usqp=CAU"));
            }
            if ((month == 10 && date >= 23) || (month == 11 && date <= 21)) {
                Zodiac = "Scorpio";
                Characteristic = "Your Characteristics : \nScorpio (October 23 - November 21)\n"
                        + "Elusive and mysterious, Scorpio is one of the most misunderstood signs of the zodiac. "
                        + "\nScorpio is a water sign that uses emotional energy as fuel, cultivating powerful wisdom through both the physical and unseen realms. "
                        + "\nIn fact, Scorpio derives its extraordinary courage from its psychic abilities, which is what makes this sign one of the most complicated, dynamic signs of the zodiac.";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRm7OwwoBeLiN5OY9C8tZ_h7kB968cXVAliyoZfK9BlqnsnTb5F4rDMF4dGEnUqdo4VQ3g&usqp=CAU"));

            }
            if ((month == 11 && date >= 22) || (month == 12 && date <= 21)) {
                Zodiac = "Sagittarius";
                Characteristic = "Your Characteristics : \nSagittarius (November 22 - December 21)\n"
                        + "Oh, the places Sagittarius goes! But… actually. This fire sign knows no bounds. Represented by the archer, "
                        + "\nSagittarians are always on a quest for knowledge. The last fire sign of the zodiac, Sagittarius launches its many pursuits like blazing arrows, "
                        + "\nchasing after geographical, intellectual, and spiritual adventures.";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgoZ_b8Da-wm_bMK7jHj9GmPPdGvpRi7G6Cb9RIzmGy2Uy31X4dk_AVMb9RHo4KKrk0uY&usqp=CAU"));
            }
            if ((month == 12 && date >= 22) || (month == 1 && date <= 20)) {
                Zodiac = "Capricorn";
                Characteristic = "Your Characteristics : \nCapricorn (December 22 - January 20)\n"
                        + "What is the most valuable resource? For Capricorn, the answer is clear: Time. "
                        + "\nCapricorn is climbing the mountain straight to the top and knows that patience, perseverance, and dedication is the only way to scale. The last earth sign of the zodiac, "
                        + "\nCapricorn, is represented by the sea-goat, a mythological creature with the body of a goat and the tail of a fish. "
                        + "\nAccordingly, Capricorns are skilled at navigating both the material and emotional realms.";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZ6u-DgAzCLui1MGxL8IRagnNnlNV2XhmO4ufuQWeWDtAynE_YOYCZ67skd9F9-XHlScQ&usqp=CAU"));

            }
            if ((month == 1 && date >= 21) || (month == 2 && date <= 19)) {
                Zodiac = "Aquarius";
                Characteristic = "Your Characteristics : \nAquarius (January 21 - Febuary 19)\n"
                        + "Despite the \"aqua\" in its name, Aquarius is actually the last air sign of the zodiac. "
                        + "\nInnovative, progressive, and shamelessly revolutionary, Aquarius is represented by the water bearer, the mystical healer who bestows water, or life, upon the land. "
                        + "\nAccordingly, Aquarius is the most humanitarian astrological sign. At the end of the day, Aquarius is dedicated to making the world a better place.";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkBNzRUJbd9bo3gwyfYAB7T_lZVn72XM4Cwg&usqp=CAU"));
            }
            if ((month == 2 && date >= 20) || (month == 3 && date <= 20)) {
                Zodiac = "Pisces";
                Characteristic = "Your Characteristics : \nPisces (Febuary 20 - March 20)\n"
                        + "If you looked up the word \"psychic\" in the dictionary, there would definitely be a picture of Pisces next to it. "
                        + "\nPisces is the most intuitive, sensitive, and empathetic sign of the entire zodiac — and that’s because it’s the last of the last. As the final sign, "
                        + "\nPisces has absorbed every lesson — the joys and the pain, the hopes and the fears — learned by all of the other signs. "
                        + "\nIt's symbolized by two fish swimming in opposite directions, representing the constant division of Pisces' attention between fantasy and reality.";
                icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS1Vh02P2oV01R1T_yRcar7k47AUU1ywNoLC8oZF6CD5EGo3p3bhSlxkTxdQVjaGhZcm_c&usqp=CAU"));
            }
            //Life Path Finder
            //Date
            int a = date / 10;
            int b = date % 10;
            int datesum = a + b;
            //Month
            int c = month / 10;
            int d = month % 10;
            int monthsum = c + d;
            //Year
            int e = year / 1000;
            int f = year % 1000;
            int g = f / 100;
            int h = f % 100;
            int i = h / 10;
            int j = f % 10;
            int yearsum = e + g + i + j;
            //LifePath
            int LifePath1 = datesum + monthsum + yearsum;
            int LifePath2 = LifePath1 / 10;
            int LifePath3 = LifePath1 % 10;
            LifePath = LifePath2 + LifePath3;
            //Prints

            JOptionPane.showMessageDialog(null, "Hi " + HonorName + name + ",\n" + "Your Date Of Birth : " + String.format("%02d", date) + "/" + String.format("%02d", month) + "/" + String.format("%4d", year)
                    + "\nYour Age : " + age + "\nYour Zodiac Sign Is : " + Zodiac + "\nYour Life Path Number : " + LifePath + "\n" + Characteristic, "Zodiac Results", JOptionPane.INFORMATION_MESSAGE, icon);

            rep = JOptionPane.showConfirmDialog(null, "Would You Like To Use The Program Again?", "Repeat?", JOptionPane.YES_NO_OPTION);
        } while (rep == 0);

        icon = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTR5Uq2w5tuE6h9RSptbpcj_IboZmjzIR7tOQ&usqp=CAU"));
        JOptionPane.showMessageDialog(null, "Thank You For Using Luke's Zodiac Sign Finder", "Thank You :)", JOptionPane.INFORMATION_MESSAGE, icon);
    }

}
