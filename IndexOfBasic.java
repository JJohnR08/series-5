// This program finds the first occurrence of letters or substrings.
public class IndexOfBasic {
public static void main(String[] args) {
String s = "antidisestablishmentarianism";
System.out.println(s.indexOf("an")); // 1
System.out.println(s.indexOf("ism")); // 2
System.out.println(s.indexOf("x")); // -1 (not found)
}
}