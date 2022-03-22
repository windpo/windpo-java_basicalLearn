public class Test {
    public static void main(String[] args) {
        String content="#include<iostream>\n" +
                "\n" +
                "\u200D\n" +
                "using namespace std;\n" +
                "\n" +
                "\u200D\n" +
                "class Point\n" +
                "\n" +
                "\u200D\n" +
                "{private:\n" +
                "\n" +
                "\u200D\n" +
                "    int x,y;\n" +
                "\n" +
                "\u200D\n" +
                "public:\n" +
                "\n" +
                "\u200D\n" +
                "    void init(int a,int b)\n" +
                "\n" +
                "\u200D\n" +
                "    {  this -> x = a  ;\n" +
                "\n" +
                "\u200D\n" +
                "this -> y = b ;\n" +
                "\n" +
                "\u200D\n" +
                "    }\n" +
                "\n" +
                "\u200D\n" +
                "    void setx(int a)\n" +
                "\n" +
                "\u200D\n" +
                "    {  this -> x = a ;\n" +
                "\n" +
                "\u200D\n" +
                "    }\n" +
                "\n" +
                "\u200D\n" +
                "    void sety(int b)\n" +
                "\n" +
                "\u200D\n" +
                "    {  this -> y = b ;\n" +
                "\n" +
                "\u200D\n" +
                "    }\n" +
                "\n" +
                "\u200D\n" +
                "    int getx()\n" +
                "\n" +
                "\u200D\n" +
                "    {  return this -> x ;\n" +
                "\n" +
                "\u200D\n" +
                "    }\n" +
                "\n" +
                "\u200D\n" +
                "    int gety()\n" +
                "\n" +
                "\u200D\n" +
                "    {  return this -> y ;\n" +
                "\n" +
                "\u200D\n" +
                "    }   \n" +
                "\n" +
                "\u200D\n" +
                "};\n" +
                "\n" +
                "\u200D\n" +
                "int main()\n" +
                "\n" +
                "\u200D\n" +
                "{   Point A,B;\n" +
                "\n" +
                "\u200D\n" +
                "    A.init( 702 , 311 ) ;\n" +
                "\n" +
                "\u200D\n" +
                "    B.init( 311 , 702 ) ;\n" +
                "\n" +
                "\u200D\n" +
                "    cout << \"A.x=\" << A.getx() <<\" \"<< \"B.y=\" << B.gety() << endl;\n" +
                "\n" +
                "\u200D\n" +
                "    return 0;\n" +
                "\n" +
                "\u200D\n" +
                "\u200C}\n" +
                "\n" +
                "\u200D";
    }
}
