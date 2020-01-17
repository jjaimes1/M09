package com.jj;

public class Bank implements Runnable
{
    public Compte compte;
    public int movimentDinners;

    public Bank(Compte compte, int movimentDinners) {
        this.compte = compte;
        this.movimentDinners = movimentDinners;
    }

    public static void main(String[] args)
    {
        Compte operacio = new Compte();
        Bank fil_1 = new Bank(operacio,100);
        Bank fil_2 = new Bank(operacio,200);
        Bank fil_3 = new Bank(operacio,-30);
        Bank fil_4 = new Bank(operacio,1000);
        Bank fil_5 = new Bank(operacio,-50);

        Thread moviment_1 = new Thread(fil_1);
        Thread moviment_2= new Thread(fil_2);
        Thread moviment_3= new Thread(fil_3);
        Thread moviment_4 = new Thread(fil_4);
        Thread moviment_5 = new Thread(fil_5);

        moviment_1.setName("fil 1");
        moviment_2.setName("fil 2");
        moviment_3.setName("fil 3");
        moviment_4.setName("fil 4");
        moviment_5.setName("fil 5");

        moviment_1.start();
        moviment_2.start();
        moviment_3.start();
        moviment_4.start();
        moviment_5.start();


    }

    @Override
    public void run()
    {
        if (Thread.currentThread().getName().equals("fil 1"))
        {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
