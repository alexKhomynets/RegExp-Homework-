import java.util.regex.*;

// Проблеми з 12 стрічкою.

public class PersonExcisting {
    public static void main(String [] args){

        identifyPerson();
    }
    static private final Pattern patEmail =  Pattern.compile("[A-Za-z0-9_-]+@([a-z]+\\.((com)||(ru)||(ua)))");
    static  private final Pattern patName =  Pattern.compile("[A-Za-z\\s]{1,780}+");
    static  private final Pattern patAddress =  Pattern.compile("[A-Za-z\\s_-]+((^Str\\.)||(^№\\s)[0-9]{1,7}$)");

    public static void identifyPerson(){
        Person p1 = new Person("Jack", "Pinewood Str." , "jack_lamberjack3@gmail.com");
        Person p2 = new Person("Kyle", "Oak Str." , "kyle_the_beaver-11@gmail.com");
        Person p3 = new Person("Jason", "USSR", "kiniaevFoma_aka_Bourne@mail.ru");
        Person p4 = new Person("Undlmsssjjcvjhsvsgvbxxvxgsvcvs","FJvjJ d678565","dddd@ru.ru");

        emailChecking(p1.getEmail());
        nameChecking(p1.getName());
        streetChecking(p1.getAddress());



      //  emailChecking(p2.getEmail());
      //  emailChecking(p3.getEmail());

      /*  String  longestName = "Adolph Blaine Charles David Earl Frederick Gerald Hubert Irvim John Kenneth Loyd Martin Nero Oliver Paul Quincy Randolph Sherman Thomas Uncas Victor Willian Xerxes Yancy Zeus Wolfeschlegelsteinhausenbergerdorffvoralternwarengewissenhaftschafers wesenchafewarenwholgepflegeundsorgfaltigkeitbeschutzenvonangereifen duchihrraubgiriigfeindewelchevorralternzwolftausendjahresvorandieer scheinenbanderersteerdeemmeshedrraumschiffgebrauchlichtalsseinu rsprungvonkraftgestartseinlangefahrthinzwischensternartigraumaufde rsuchenachdiesternwelshegehabtbewohnbarplanetenkreisedrehensichund wohinderneurassevanverstandigmenshlichkeittkonntevortpflanzenundsiche rfreunanlebenslamdlichfreudeundruhemitnichteinfurchtvorangreifenvon andererintlligentgeschopfsvonhinzwischensternartigraum";
        String temp = longestName.replace(" " ,"" );
        System.out.println(temp.length());
        NameChecking(longestName);
      */
    }
    public static void emailChecking (String em){
        Matcher mat = patEmail.matcher(em);
        System.out.println(mat.matches());
    }

    public static void nameChecking (String n){
        Matcher mat = patName.matcher(n);
        System.out.println(mat.matches());
    }

    public static void streetChecking (String st){
        Matcher mat = patAddress.matcher(st);
        System.out.println(mat.matches());
    }
}
