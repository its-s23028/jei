//s23028 d50Q26kadai.java
//列挙型の課題
//Q26をアレンジして列挙型に定義したConditionのすべて
//
//
//

enum Condition {ROAD, MUD, SNOW}

class d50Q26kadai {
    public static void main(String[] args){
       // Conditionの一つの値を出力
       Condition c = Condition.SNOW;
       System.out.println("Condition is " + c);

       // Condition列挙型の要素全てを出力
       for (int i = 0; i < Condition.values().length; i++) {
           System.out.println(Condition.values()[i]);
       }
    }
}

