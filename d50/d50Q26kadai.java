// s23028 d50Q26kadai.java
// 列挙型課題

enum Condition {ROAD, MUD, SNOW}

class d50Q26kadai {
    public static void main(String[] args) {
	for (int i=0; i < Condition.values().length; i++) {
	System.out.println("Condition is " + Condition.values()[i]);
	}
    }
}
