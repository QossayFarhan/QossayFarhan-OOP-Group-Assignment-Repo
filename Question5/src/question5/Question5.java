package question5;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Question5 {

    public static void main(String[] args) {
        boolean repeat;
        String name;
        String DOB;
        String b1;
        String Zodiac = "";
        String Characteristic = "";
        int year = 0;
        int LifePath = 0;
        int leapyear = 0;
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        int currentmonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentdate = Calendar.getInstance().get(Calendar.DATE);
        int date = 0;
        int maxdate;
        int month = 0;
        //Name Getter
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
                b1 = JOptionPane.showInputDialog(null, "Please Input Year Of Birth In Numbers", "Input", JOptionPane.QUESTION_MESSAGE);
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
                b1 = JOptionPane.showInputDialog(null, "Please Input Month Of Birth In Numbers", "Input", JOptionPane.QUESTION_MESSAGE);
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
                b1 = JOptionPane.showInputDialog(null, "Please Input Date Of Birth In Numbers", "Input", JOptionPane.QUESTION_MESSAGE);
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
        }
        if ((month == 4 && date >= 21) || (month == 5 && date <= 21)) {
            Zodiac = "Taurus";
            Characteristic = "Your Characteristics : \nTaurus (April 21 - May 21)\nWhat sign is more likely to take a six-hour bath, followed by a luxurious Swedish massage and decadent dessert spread? Why Taurus, of course! "
                    + "\nTaurus is an earth sign represented by the bull. Like their celestial spirit animal, Taureans enjoy relaxing in serene, bucolic environments surrounded by soft sounds, soothing aromas, and succulent flavors.";
        }
        if ((month == 5 && date >= 22) || (month == 6 && date <= 21)) {
            Zodiac = "Gemini";
            Characteristic = "Your Characteristics : \nGemini (May 22 - June 21)\nHave you ever been so busy that you wished you could clone yourself just to get everything done? "
                    + "That's the Gemini experience in a nutshell. \nSpontaneous, playful, and adorably erratic, Gemini is driven by its insatiable curiosity. Appropriately symbolized by the celestial twins, this air sign was interested in so many pursuits that it had to double itself. You know, NBD!";

        }
        if ((month == 6 && date >= 22) || (month == 7 && date <= 22)) {
            Zodiac = "Cancer";
            Characteristic = "Your Characteristics : \nCancer (June 22 - July 22)\nRepresented by the crab, Cancer seamlessly weaves between the sea and shore representing Cancer’s ability to exist in both emotional and material realms. "
                    + "\nCancers are highly intuitive and their psychic abilities manifest in tangible spaces. But—just like the hard-shelled crustaceans—this water sign is willing to do whatever it takes to protect itself emotionally. In order to get to know this sign, you're going to need to establish trust!";
        }
        if ((month == 7 && date >= 23) || (month == 8 && date <= 22)) {
            Zodiac = "Leo";
            Characteristic = "Your Characteristics : \nLeo (July 23 - August 22)\nRoll out the red carpet because Leo has arrived. Passionate, loyal, and infamously dramatic, "
                    + "\nLeo is represented by the lion and these spirited fire signs are the kings and queens of the celestial jungle. They're delighted to embrace their royal status: Vivacious, theatrical, and fiery, Leos love to bask in the spotlight and celebrate… well, themselves.";
        }
        if ((month == 8 && date >= 23) || (month == 9 && date <= 22)) {
            Zodiac = "Virgo";
            Characteristic = "Your Characteristics : \nVirgo (August 23 - September 22)\nYou know the expression, \"if you want something done, give it to a busy person?\" Well, that definitely is the Virgo anthem. Virgos are logical, practical, and systematic in their approach to life. "
                    + "\nVirgo is an earth sign historically represented by the goddess of wheat and agriculture, an association that speaks to Virgo's deep-rooted presence in the material world. This earth sign is a perfectionist at heart and isn’t afraid to improve skills through diligent and consistent practice.";
        }
        if ((month == 9 && date >= 23) || (month == 10 && date <= 22)) {
            Zodiac = "Libra";
            Characteristic = "Your Characteristics : \nLibra (September 23 - October 22)\nBalance, harmony, and justice define Libra energy. As a cardinal air sign, Libra is represented by the scales (interestingly, the only inanimate object of the zodiac), "
                    + "\nan association that reflects Libra's fixation on establishing equilibrium. Libra is obsessed with symmetry and strives to create equilibrium in all areas of life — especially when it comes to matters of the heart.";
        }
        if ((month == 10 && date >= 23) || (month == 11 && date <= 21)) {
            Zodiac = "Scorpio";
            Characteristic = "Your Characteristics : \nScorpio (October 23 - November 21)\nElusive and mysterious, Scorpio is one of the most misunderstood signs of the zodiac. "
                    + "\nScorpio is a water sign that uses emotional energy as fuel, cultivating powerful wisdom through both the physical and unseen realms. In fact, Scorpio derives its extraordinary courage from its psychic abilities, which is what makes this sign one of the most complicated, dynamic signs of the zodiac.";
        }
        if ((month == 11 && date >= 22) || (month == 12 && date <= 21)) {
            Zodiac = "Sagittarius";
            Characteristic = "Your Characteristics : \nSagittarius (November 22 - December 21)\nOh, the places Sagittarius goes! But… actually. This fire sign knows no bounds. Represented by the archer, "
                    + "\nSagittarians are always on a quest for knowledge. The last fire sign of the zodiac, Sagittarius launches its many pursuits like blazing arrows, chasing after geographical, intellectual, and spiritual adventures.";
        }
        if ((month == 12 && date >= 22) || (month == 1 && date <= 20)) {
            Zodiac = "Capricorn";
            Characteristic = "Your Characteristics : \nCapricorn (December 22 - January 20)\nWhat is the most valuable resource? For Capricorn, the answer is clear: Time. Capricorn is climbing the mountain straight to the top and knows that patience, perseverance, and dedication is the only way to scale. The last earth sign of the zodiac, "
                    + "\nCapricorn, is represented by the sea-goat, a mythological creature with the body of a goat and the tail of a fish. Accordingly, Capricorns are skilled at navigating both the material and emotional realms.";

        }
        if ((month == 1 && date >= 21) || (month == 2 && date <= 19)) {
            Zodiac = "Aquarius";
            Characteristic = "Your Characteristics : \nAquarius (January 21 - Febuary 19)\nDespite the \"aqua\" in its name, Aquarius is actually the last air sign of the zodiac. "
                    + "\nInnovative, progressive, and shamelessly revolutionary, Aquarius is represented by the water bearer, the mystical healer who bestows water, or life, upon the land. Accordingly, Aquarius is the most humanitarian astrological sign. At the end of the day, Aquarius is dedicated to making the world a better place.";
        }
        if ((month == 2 && date >= 20) || (month == 3 && date <= 20)) {
            Zodiac = "Pisces";
            Characteristic = "Your Characteristics : \nPisces (Febuary 20 - March 20)\nIf you looked up the word \"psychic\" in the dictionary, there would definitely be a picture of Pisces next to it. Pisces is the most intuitive, sensitive, and empathetic sign of the entire zodiac — and that’s because it’s the last of the last. As the final sign, "
                    + "\nPisces has absorbed every lesson — the joys and the pain, the hopes and the fears — learned by all of the other signs. It's symbolized by two fish swimming in opposite directions, representing the constant division of Pisces' attention between fantasy and reality.";
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
        
        System.out.println("Hi " + HonorName + name+",");
        System.out.println("Your Date Of Birth : " + String.format("%02d", date) + "/" + String.format("%02d", month) + "/" + String.format("%4d", year));
        System.out.println("Your Age : "+age);
        System.out.println("Your Zodiac Sign Is : "+Zodiac);
        System.out.println("Your Life Path Number : "+LifePath);
        System.out.println(Characteristic);

    }

}
