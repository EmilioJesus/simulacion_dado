/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EmilioJesus
 */
public class dado 
{
    public static void main (String []args)
    {
        metodo f=new metodo();
        int  num = (int) (Math.random() * 5+1);
        System.out.println("el primer numero es "+num);
        f.tiros(num);
        
    }
    
}
