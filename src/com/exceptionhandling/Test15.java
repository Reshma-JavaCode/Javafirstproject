package com.exceptionhandling;


public class Test15 
{  
    public static void aMethod() throws Exception 
    {
        try /* Line 5 */
        {
            throw new Exception(); /* Line 7 */
        } 
        finally /* Line 9 */
        {
            System.out.print("finally "); /* Line 11 */
        } 
    } 
    public static void main(String args[]) //throws Exception
    {
        try 
        {
            aMethod();  
        } 
        catch (Exception e) /* Line 20 */
        {
           System.out.print("exception "); 
        } 
        System.out.print("finished"); /* Line 24 */
    } 
}