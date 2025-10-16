package library;
public class Main {
public static void main(String[] args) {
Livre l = new Livre("L'étranger", "Albert Camus");
System.out.println(l);
l.emprunter();
System.out.println(l);
}
}