public class object{
    public static void main(String args[]){
        MyEXP number1 = new MyEXP();
        number1.base = 2;
        number1.exp = 2;
        System.out.println(number1.getValue());
    }

    public class MyEXP {
        int base;
        int exp;
        int getValue() {
            int res = 1;
            for(int i = 0; i < exp; i = i+1)
                res = res * base;
            return res;
    }
}
