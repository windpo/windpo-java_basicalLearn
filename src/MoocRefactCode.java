import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoocRefactCode {
    public static void main(String[] args) {
        String content="\u200Eusing namespace std;\n" +
                "\n" +
                "\u200D\n" +
                "\u200Eclass AA\n" +
                "\n" +
                "\u200D\n" +
                "\u200E{\n" +
                "\n" +
                "\u200D\n" +
                "\u200E       const int a;\n" +
                "\n" +
                "\u200D\n" +
                "\u200E       static const int b;\n" +
                "\n" +
                "\u200D\n" +
                "\u200Epublic:\n" +
                "\n" +
                "\u200D\n" +
                "\u200E       AA( int i );\n" +
                "\n" +
                "\u200D\n" +
                "\u200E       void Print();\n" +
                "\n" +
                "\u200D\n" +
                "\u200E       const int &r;\n" +
                "\n" +
                "\u200D\n" +
                "\u200E};\n" +
                "\n" +
                "\u200D\n" +
                "\u200Econst int AA::b = 15;\n" +
                "\n" +
                "\u200D\n" +
                "\u200EAA::AA(int i):a( i ), r( a )\n" +
                "\n" +
                "\u200D\n" +
                "\u200E{  }\n" +
                "\n" +
                "\u200D\n" +
                "\u200Evoid AA::Print( )\n" +
                "\n" +
                "\u200D\n" +
                "\u200E{\n" +
                "\n" +
                "\u200D\n" +
                "\u200E       cout << a << \",\" << b << \",\" << r <<\",\" ;\n" +
                "\n" +
                "\u200D\n" +
                "\u200E}\n" +
                "\n" +
                "\u200D\n" +
                "\u200Eint main( )\n" +
                "\n" +
                "\u200D\n" +
                "\u200E{\n" +
                "\n" +
                "\u200D\n" +
                "\u200E       AA a1(10), a2(20);\n" +
                "\n" +
                "\u200D\n" +
                "\u200E       a1.Print( );\n" +
                "\n" +
                "\u200D\n" +
                "\u200E       a2.Print( );\n" +
                "\n" +
                "\u200D\n" +
                "\u200E       return 0;\n" +
                "\n" +
                "\u200D\n" +
                "\u200E}";
        String regString = "(?!\n|\u200C|\u200E).+";
        Pattern pattern = Pattern.compile(regString);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
