public class Deadlock {

    /*
    20.5
    */

  public static class Account {

    private static int globalId;
    private int balance;
    private int id;

    public Account(int balance) {
      this.balance = balance;
      this.id = ++globalId;
    }

    public static void transfer(final Account from, final Account to, final int amount) {
      Thread transfer = new Thread(new Runnable() {
        @Override
        public void run() {
          from.move(to, amount);
        }
      });
      transfer.start();
    }

    public int getBalance() {
      return balance;
    }

    private boolean move(Account to, int amount) {
      synchronized (this) {
        synchronized (to) {
          if (amount > balance) {
            return false;
          }
        }
        to.balance += amount;
        this.balance -= amount;
        return true;
      }
    }
  }


}
