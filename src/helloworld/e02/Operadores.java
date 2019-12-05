/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld.e02;

/**
 *
 * @author DELL
 */
public class Operadores {

    public static void main(String[] args) {

//Aritmeticos : +, -, *, %, /
        int a = 2;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println("********************");
//De atribuicao : +=, -=, *=, /= 

        System.out.println(b += a);
        System.out.println(b -= a);
        System.out.println(b *= a);
        System.out.println("********************");

//De comparacao : ==, !=, >, <, >=, <=
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println("********************");

//Logicos: &, |, !
        if ((1 == 1) && (2 == 2)) {
            System.out.println("afs");
        }

        System.out.println("********************");

//Bitwise: &, | 
        System.out.println((a | b));
        
        System.out.println("********************");

    }

}
