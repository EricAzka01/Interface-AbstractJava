
package interfaceabstract;

public class InterfaceAbstractEricAzkaNugroho {

    public static void main(String[] args) {
        Account acc1 = new Account("Eric Azka Nugroho", "41567", 2000);
//        System.out.println(acc1.getBankName());
        acc1.deposit(1000);
        acc1.deposit(1000);
        acc1.print();
        System.out.println("\n");


        CreditAccount acc2 = new CreditAccount("Azka Nugroho Eric", "54545", 1000);
//        System.out.println(acc1.getBankName());
        acc2.print();

        //polymorphism with instanceof
        System.out.println("\n\n");
        AbstractBankAccount[] listAll = new AbstractBankAccount[5];
        listAll[0] = acc1;
        listAll[1] = acc2;
        listAll[2] = acc1;
        listAll[3] = acc2;
        listAll[4] = acc1;

        for(AbstractBankAccount acc : listAll)
            if(acc instanceof Account)
                System.out.println("akun tabungan");
            else
                System.out.println("akun kredit");
    }



    }