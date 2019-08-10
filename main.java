/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author patta
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        String tokens[] = scanner.nextLine().split(" ");
        //System.out.println(tokens.length);
        if(tokens.length > 0){
            for(int i = 0;i < tokens.length;i++){
                sum += Integer.parseInt(tokens[i]);
            }
        }
        System.out.println("sum : "+sum);
    }
    
    
    
}














