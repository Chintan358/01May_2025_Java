package exception;

class InsufficentAmountException  extends  Exception
{
    InsufficentAmountException(double amt)
    {
        super("you sort of amount : "+amt);
    }
}


class Bank
{
    double balance;

    public void checkBalance()
    {
        System.out.println("Current balance is : "+balance);
    }

    public void deposite(double amt)
    {
        balance = balance+amt;
    }

    public void withdrow(double amt) throws InsufficentAmountException {
        if(amt>balance)
        {
            //System.out.println("insufficient amount");
            throw  new InsufficentAmountException(amt-balance);
        }
        else {
            balance-=amt;

        }
    }
}

public class CustomeException {

    public static void main(String[] args) {

        Bank b = new Bank();
        b.checkBalance();
        b.deposite(5000);
        b.deposite(3000);
        b.checkBalance();

        try {
            b.withdrow(15000);
        } catch (InsufficentAmountException e) {
            e.printStackTrace();
        }

//        b.withdrow(50000);
        b.checkBalance();
        System.out.println("Hello");

    }
}
