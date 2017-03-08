
package aula3;


public class Aula3 {


    public static void main(String[] args) {
    
        Conta c1 = new Conta();
        c1.saldo = 1000;
        c1.visualizarSaldo();
        c1.depositar(1000);
        c1.visualizarSaldo();
        c1.sacar(5000);
        c1.visualizarSaldo();
    }
    
}
