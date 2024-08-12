package basic;

public class Variable {
    int age = 27;
    int Age = 29; //둘은 서로 다른 변수

    //int 700 = 365; (x) 숫자로만 x
    //int 7number = 7; (x) 숫자로 시작해도 x
    int number7 = 7; // ok
    int num7ber = 7; // ok

    //int my birth day = 19921013; 공백 x
    int myBirthDay = 19921013; //ok

    // String class = "클래스";  키워드 x
    String Class = "클래스"; // 추천 x
    String className = "클래스"; // 차라리 이렇게.
}