package com.mypackage.skobka;


public class Skobka {



    public static void main(String[] args) {

        String str = "()(){{]]";

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i< str.length(); i++){
            String sym = str.substring(i, i+1);
            if (sym.equals("(")) {
                count1 ++ ;
            }
            else if (sym.equals(")")){
                count1 --;
            }
            else if (sym.equals("[")){
                count2++;
            }
            else if (sym.equals("]")){
                count2--;
            }
            else if (sym.equals("{")){
                count3++;
            }
            else if (sym.equals("}")){
                count3--;
            }

        }

        if (count1==0) System.out.println("ПСП круглые скобки") ; else System.out.println("Нет )");
        if (count2==0) System.out.println("ПСП квадратные скобки"); else System.out.println("Нет ]");
        if (count3==0) System.out.println("ПСП фигурные скобки"); else System.out.println("Нет }");


    }
}