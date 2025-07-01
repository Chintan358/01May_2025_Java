package exception;

class InsufficientAmountException extends Exception
{
    double amt;
    InsufficientAmountException(double amt)
    {
        this.amt=  amt;
    }

    @Override
    public String getMessage() {
        return "You need more "+amt;
    }
}

class Bank
{
    double balance;

    public void getBalance()
    {
        System.out.println("Current balance is : "+balance);
    }

    public void diposite(double amt)
    {
        balance+=amt;
    }

    public void withdrow(double amt) throws InsufficientAmountException {
        if(amt>balance)
        {
           // System.out.println("Insuffcinet amount");
            throw new InsufficientAmountException(amt-balance);
        }
        else {
            balance-=amt;
        }
    }
}


public class CustomeException {
    public static void main(String[] args) {


        Bank b = new Bank();
        b.getBalance();
        b.diposite(5000);
        b.diposite(8000);
        b.getBalance();
        try {
            b.withdrow(100000);
        } catch (InsufficientAmountException e) {
            e.printStackTrace();
            e.getMessage();
        }
        b.getBalance();

    }
}
