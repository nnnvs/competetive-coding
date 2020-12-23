package leetcode;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        return getRoman(num,"");
    }

    //    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.

    public static String getRoman(int num, String result)  {
        if(num==0){
            return result;
        } else if(num == 1) {
            result = result+"I";
            num=num-1;
            return getRoman(num,result);
        } else if(num < 4 && num > 1){
            while (num!=0) {
                result = result+"I";
                num=num-1;
            }
            return result;
        } else if(num == 4){
            result = result+"IV";
            return result;
        } else if(num == 5){
            result = result+"V";
            return result;
        } else if(num > 5 && num <9){
            result = result+"V";
            num=num-5;
            while (num!=0) {
                result = result+"I";
                num=num-1;
            }
            return result;
        } else if(num==9){
            result = result+"IX";
            return result;
        } else if(num>=10 && num <40){
            result = result+"X";
            num = num-10;
            return getRoman(num,result);
        } else if(num>=40 && num<50){
            result = result+"XL";
            num = num-40;
            return getRoman(num,result);
        } else if(num>=50 && num<90){
            result = result+"L";
            num = num-50;
            return getRoman(num,result);
        } else if(num>=90 && num<100){
            result = result+"XC";
            num = num-90;
            return getRoman(num,result);
        } else if(num>=100 && num<400){
            result = result+"C";
            num = num-100;
            return getRoman(num,result);
        } else if(num>=400 && num<500){
            result = result+"CD";
            num = num-400;
            return getRoman(num,result);
        } else if(num>=500 && num<900){
            result = result+"D";
            num = num-500;
            return getRoman(num,result);
        } else if(num>=900 && num<1000){
            result = result+"CM";
            num = num-900;
            return getRoman(num,result);
        } else{
            result = result+"M";
            num = num-1000;
            return getRoman(num,result);
        }
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(3999));
    }
}