package com.jj;

public class Compte
{
    public int saldo = 0;

    public Compte()
    {

    }

    public void treureDinners (int euros)
    {
        saldo = saldo + euros;
    }
    public void ingressarDinners (int euros)
    {
        saldo = saldo + euros;
    }
    public int comprovarSaldo()
    {
        return saldo;
    }
}
