package test;

import poo.Paire;

import java.util.ArrayList;
import java.util.Collection;

public class TestUnitairePaire {

    public static void allTest(){
        testGetteurs();
        testSetteurs();
        testCopiePremier1();
        testCopierPremier2();
        testMemePremier();
        testMemePremier2();
        testPrendPremier();
        testToString();
        assert false: "Fin des tests !";
    }

    public static void testGetteurs(){
        Paire<Integer, String> p = new Paire<>(12, "étudiant");
        assert p.getPremier().equals(12);
        assert p.getSecond().equals("étudiant");
    }

    public static void testSetteurs(){
        Paire<Integer, String> p = new Paire<>();
        p.setPremier(22);
        p.setSecond("programmes");
        assert p.getPremier().equals(22);
        assert p.getSecond().equals("programmes");
    }

    public static void testCopiePremier1(){
        Paire<Integer, String> p = new Paire<>(20, "Génie Logiciel");
        Integer[] tab = new Integer[5];
        Paire.copiePremier(p, tab, 0);
        assert tab[0]==20;
    }

    public static void testCopierPremier2(){
        Paire<Integer, String> p = new Paire<>(20, "Génie Logiciel");
        ArrayList<Integer> collection = new ArrayList<>();
        Paire.<Integer, String>copiePremier(p, collection);
        assert collection.get(0).equals(20);
    }

    public static void testMemePremier(){
        Paire<Integer, String> p1 = new Paire<>(20, "Génie Logiciel");
        Paire<Integer, String> p2 = new Paire<>(19, "Prince2");
        Paire<Integer, String> p3 = new Paire<>(20, "POOA");
        assert !p1.memePremier(p2);
        assert p1.memePremier(p3);
    }

    public static void testMemePremier2(){
        Paire<Integer, String> p1 = new Paire<>(20, "Génie Logiciel");
        Paire<Integer, String> p2 = new Paire<>(19, "Prince2");
        Paire<Integer, String> p3 = new Paire<>(20, "POOA");
        assert !p1.memePremier2(p2);
        assert p1.memePremier2(p3);
    }

    public static void testPrendPremier(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(18);list.add(20);
        Paire<Integer, ?> p1 = new Paire<>(20, "Génie Logiciel");
        p1.prendPremier(list);
        assert p1.getPremier().equals(18);
        assert !p1.getPremier().equals(20);
    }

    public static void testToString(){
        Paire<Integer, String> p1 = new Paire<>(20, "Génie Logiciel");
        assert p1.toString().equals("(20,Génie Logiciel)");
    }



}
