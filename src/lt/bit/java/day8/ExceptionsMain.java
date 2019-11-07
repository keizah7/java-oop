package lt.bit.java.day8;

class ExceptionsMain {

  public static void main(String[] args) {
//    catchAndFinallyBlocks();
    catchBlockWithMultipleExceptions();
  }

  private static void catchAndFinallyBlocks() {
    String nullString = "null";
    try {
//      nullString.length();
//      nullString.charAt(10);
      throwCheckedException(false);
    } catch (CheckedException e) {
      System.out.println("oops!");
    } catch (StringIndexOutOfBoundsException iobExc) {
      System.out.println("StringIndexOutOfBoundsException! " + iobExc.getMessage());
    } finally {
      System.out.println("finally blokas vykdomas visada");
    }
    System.out.println("viskas veikia");
//    throwUncheckedException();
  }

  private static void catchBlockWithMultipleExceptions() {
    try {
      throwCheckedException(true);
    } catch (CheckedException | UnCheckedException | NullPointerException e) {
      System.out.println("CheckedException or UnCheckedException or NullPointerException");
      if (e instanceof NullPointerException) {
        System.out.println("NullPointerException");
      }
    }
  }

  private static void throwCheckedException(boolean throwExc) throws CheckedException {
    if (throwExc) {
      throw new CheckedException();
    }
  }

  private static void throwUncheckedException() {
    throw new UnCheckedException();
  }
}
