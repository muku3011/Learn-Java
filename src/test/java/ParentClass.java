interface A {
    void demo();
}

interface B {
    void demo();
}

class ParentClass implements A, B {

    final static int finalStaticVariable = 0;
    final int finalVariable = 0;
    int variable = 0;

    @Override
    public void demo() {
        System.out.println("Same method in both interface is fine," +
                "If interface contains same signature but different" +
                "return type, than its impossible to implement both interfaces");
    }
}

class ChildClass extends ParentClass {

    final static int finalStaticVariable = 1;
    final int finalVariable = 1;
    int variable = 1;


    public static void main(String[] args) {
        //System.out.println(finalStaticVariable);

        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();

        ParentClass parentClass1 = new ChildClass();

        System.out.println(parentClass.finalStaticVariable);
        System.out.println(parentClass.finalVariable);
        System.out.println(parentClass.variable);

        System.out.println(((ParentClass) childClass).finalStaticVariable);
        System.out.println(((ParentClass) childClass).finalVariable);
        System.out.println(((ParentClass) childClass).variable);

    }
}