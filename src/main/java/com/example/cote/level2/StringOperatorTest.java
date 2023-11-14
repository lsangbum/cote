package com.example.cote.level2;

public class StringOperatorTest {
    /**
     * @auth 이상범
     * @date 23-11-15
     * @script
     * 리터럴 String / new String 비교
     * hashCode의 경우 저장된 문자열을 char형태로 변경하여 값을 저장시키기에 저장된 문자열이 같다면 동일한 결과를 추출한다
     * 이러한 경우 identifyHashCode()를 사용하여 고유한 HashCode를 추출할 수 있다.
     * 하지만 아래와 같이 new 생성자가 아닌 리터럴 형태로 생성하는 경우에는 같은 결과를 추출하는 것을 알 수 있다.
     * 왜이러는가 ?
     * new 생성자의 경우 데이터 생성 시 Heap 영역에 각각의 데이터가 생성이 되며,
     * 리터럴(String a = "리터럴";)의 경우 데이터 생성 시 String pool에 데이터가 생성되어
     * 기존과 동일한 데이터를 저장하는 경우 같은 곳(값이 저장 된 String pool)을 바라보게 된다.
     */
    public static void main(String args[]) throws Exception {
        String a = "test";
        String aa = "test";
        String b = new String("test");
        String c = new String("test");

        System.out.println("a == b >>> " + (a == b ? true : false));
        System.out.println("a == 'test' >>> " + (a == "test" ? true : false));
        System.out.println("b == 'test' >>> " + (b == "test" ? true : false));
        System.out.println("b == c >>> " + (b == c ? true : false));
        System.out.println();
        System.out.println("System.identityHashCode(a) >>> " + System.identityHashCode(a));
        System.out.println("System.identityHashCode(aa)>>> " + System.identityHashCode(aa));
        System.out.println("System.identityHashCode(b) >>> " + System.identityHashCode(b));
        System.out.println("System.identityHashCode(c) >>> " + System.identityHashCode(c));
        System.out.println();
        System.out.println("a.hashCode() >>> " + a.hashCode());
        System.out.println("aa.hashCode()>>> " + aa.hashCode());
        System.out.println("b.hashCode() >>> " + b.hashCode());
        System.out.println("c.hashCode() >>> " + c.hashCode());

    }
}
