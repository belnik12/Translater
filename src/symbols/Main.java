package symbols;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Alphabet alphabet = new Alphabet();

        try{
        if(args[0].equals("-m")) {

            System.out.println(alphabet.translateToSymbol(args[1]));

        } else if(args[0].equals("-r")) {

            System.out.println(alphabet.translateToChar(args[1]));

        } else if(args[0].equals("-h")) {
            System.out.println("===============================================================================================================================================\n\n" +
                    "===========  Если вы хотите перевести с Русского на Азбуку Морзе, то введите аргумент \'-m\'  ===================================================\n\n" +
                    "===========  Если вы хотите перевести с Азбуки Морзе перевести на Русский, то введите аргумент \'-r\'  ==========================================\n\n" +
                    "===========  Для того, чтобы написать Азбуку Морзе, нужно после каждой буквы ставить два пробела, а после каждого слова 8 пробелов  ===========\n\n" +
                    "===========  Знаки препинания ставить не нужно. Буквы могут быть разной высоты  ===============================================================\n\n" +
                    "                     А          Б          В          Г          Д          Е          Ж          З     \n" +
                    "                    *-         -***       *--        --*        -**         *         ***-       --**\n\n" +
                    "                     И          Й          К          Л          М          Н          О          П\n" +
                    "                    **        *---        -*-        *-**        --         -*        ---        *--*\n\n" +
                    "                     Р          С          Т          У          Ф          Х          Ц          Ч\n" +
                    "                    *-*        ***         -         **-        **-*       ****       -*-*       ---*\n\n" +
                    "                     Ш          Щ          Ъ          Ы          Ь          Э          Ю          Я\n" +
                    "                    ----       --*-      *--*-*      -*--       -**-      **-**       **--       *-*-\n\n" +

                    "===============================================================================================================================================");
        }
    } catch (Exception exception) {
            System.out.println("===========  Если у вас что-то не выходит, попобуйте так :\n\n" +
                    "         java -jar \"path_to_jar_file\" -{m}{r} \"text\"");
        }
//        String result = alphabet.translateToChar("привет мир");

//        String result2 = alphabet.translateToSymbol(".__.  ._.  ..  .__  .  _\t\t__  ..  ._.");

//        File file = new File("D:\\12.txt");
//        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//        writer.write(result+"\n"+result2);
//        writer.close();
//        System.out.println(result+"\n"+result2);
    }
}
