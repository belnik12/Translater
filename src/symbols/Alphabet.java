package symbols;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Alphabet {

    String resultChar = "";
    String resultSymb = "";

    String CHARACTERS = "а,б,в,г,д,е,ж,з,и,й,к," +
            "л,м,н,о,п,р,с,т,у,ф,х,ц,ч,ш,щ,ъ,ы," +
            "ь,э,ю,я";

    String[] arrCHAR = CHARACTERS.split(",");

    String AM = "*-,-***,*--,--*,-**,*,***-," +
            "--**,**,*---,-*-,*-**,--,-*,---," +
            "*--*,*-*,***,-,**-,**-*,****,-*-*," +
            "---*,----,--*-,*--*-*,-*--,-**-,**-**," +
            "**--,*-*-";

    String[] arrAM = AM.split(",");

    public String translateToSymbol(String text) {

        char[] arr = text.toLowerCase(Locale.ROOT).toCharArray();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arrCHAR.length; j++) {
                if ((arr[i] + "").equals(arrCHAR[j])) {
                    resultChar += arrAM[j] + "  ";
                }

                if (String.valueOf(arr[i]).equals(" ")) {
                    resultChar += "\t\t";
                    break;
                }
            }
        }
        return resultChar;
    }

    public String translateToChar(String text) {

        String[] split = text.split("\t\t");


        List<String[]> list1 = new ArrayList<>();

        for(int i=0; i< split.length; i++) {
            list1.add(split[i].split("  "));
        }

//        for(String[] i : list1) {
//            for(String b : i) {
//                System.out.println(b);
//            }
//        }

        for(int i=0; i<list1.size(); i++) {
            String[] tmp = list1.get(i);
            for(int j=0; j<tmp.length; j++) {
                for(int q=0; q<arrAM.length; q++) {
                    if (tmp[j].equals(arrAM[q])) {
                        resultSymb += arrCHAR[q];
                    }
                }
                resultSymb+=" ";
            }
        }
        return resultSymb;
    }

}
