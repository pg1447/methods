public class Calc {

    //typ_zwracany (void) nazwaMetody(opcjonalne_parametry) { return }

    int addTwoNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    void addAndPrint(int x, int y){
        int abc = addTwoNumbers(x, y);
        System.out.println(abc);
    }
}
