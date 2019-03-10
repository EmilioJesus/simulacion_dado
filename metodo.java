/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EmilioJesus
 */
public class metodo 
{
    public void tiros(int tiro)
    {
        int numero=0,ayuda=0,par=0,impar=0;
        for (int i = 0; i <tiro; i++) 
        {
             numero = (int) (Math.random() * 5+1);
            System.out.println(""+numero);
            ayuda=numero;  
            
              if (ayuda%2==0) 
            {
             par++;            
            }else 
            {
            impar++;
            }
        }
        
        
        
        if (ayuda==1) 
        {
            System.out.println("termina");
            
        }else if (par>impar || par>=1) 
        {
            System.out.println("no todos los numeros son impares");
             tiros(ayuda);
            
        }else
        {
             System.out.println("los numeros  son impares");
            
        }
        
       
    }
    
    
    
}

