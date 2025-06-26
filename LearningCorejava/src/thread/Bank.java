package thread;

import java.util.Scanner;

class Account
{
    double balance;

    Account(double balance)
    {
        this.balance=balance;
    }

    public boolean isexist(double amt)
    {
        boolean b = false;
        if(amt>balance)
        {
            b = false;
        }
        else {
            b = true;
        }
        return b;
    }

    public void withdrow(double amt)
    {
        balance  =balance-amt;
        System.out.println("amount debited....");

    }
}

class Customer extends  Thread
{
        Account account;
        String name;
        Customer(Account account, String name)
        {
            this.account=account;
            this.name=name;
        }

        Scanner sc = new Scanner(System.in);
    @Override
    public void run() {

        synchronized (account) {
            System.out.println("Enter amount by : " + name);
            double amt = sc.nextDouble();

            boolean b = account.isexist(amt);

            if (b) {
                account.withdrow(amt);
            } else {
                System.out.println("Insufficinet amount");
            }
        }


    }
}

public class Bank {
    public static void main(String[] args) {


        Account account = new Account(50000);

        Customer c1 = new Customer(account,"A");
        Customer c2 = new Customer(account,"B");

        c1.start();
        c2.start();

    }
}
