class A {
    A() { 
      System.out.println("Rose is flower.");
    }
  }
  class B extends A {
    B() {
      System.out.println("I like a big fish.");
    }
  }
  class C extends B {
    C() {
      System.out.println("Welcome to Java.");
    }
  }
    class CallingCons {
    public static void main(String args[]) {
      System.out.println("Writing Output is a fun.");
      B c = new B();
    }
  }