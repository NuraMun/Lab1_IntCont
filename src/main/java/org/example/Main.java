package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IntCont cont = new IntCont();
        cont.add(1);
        cont.add(2);
        cont.add(3);
        cont.add(4);
        cont.add(5);
        System.out.println("Size of container: "+ cont.size());
        cont.printElements();
        System.out.println("\n1st elem: "+cont.get(0));
        cont.remove(0);
        System.out.println("1st elem: "+cont.get(0));
    }
}
