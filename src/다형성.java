class Parent {
    // Parent 클래스의 메서드
    public void parentMethod() {
        System.out.println("Parent's method");
    }

    // 부모 클래스의 고유 필드
    public String parentField = "Parent Field";
}

class Child extends Parent {
    // Child 클래스의 메서드
    public void childMethod() {
        System.out.println("Child's method");
    }

    // 자식 클래스의 고유 필드
    public String childField = "Child Field";

    // 부모 클래스의 메서드 오버라이딩
    @Override
    public void parentMethod() {
        System.out.println("Overridden Parent's method in Child");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // 케이스 1: Parent p = new Child()
        Parent p = new Child();
        p.parentMethod();  // 출력: "Overridden Parent's method in Child"
        // p.childMethod(); // 컴파일 에러 - Child의 메서드는 접근 불가
        // String childField = p.childField; // 컴파일 에러 - Child의 필드는 접근 불가

        // 케이스 2: Child c = new Parent()
        // Child c = new Parent(); // 컴파일 에러 - 상속 관계의 역방향 캐스팅은 불가능

        // 명시적 캐스팅 (강제 형변환)
        Parent parent = new Child();
        Child castedChild = (Child) parent; // 다운캐스팅
        castedChild.childMethod(); // 정상 작동
        castedChild.parentMethod(); // 정상 작동
    }
}