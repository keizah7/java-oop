package lt.bit.java.day6.cw;

class C {
  int f(int i) {    return 1;  } // I
   void f (String a, int b){} // II
   void f (int b, String a){} // III
//   void f (int j){} // IV }

   public static void main(String[] args) {
     new C().f(10);
   }
}