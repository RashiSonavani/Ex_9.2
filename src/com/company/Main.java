package com.company;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args)
    {
        for (int i = 0; i < 4; i++)
        {
            eclass.genException(i);
            System.out.println();
        }



    }

    public class eclass {
        public static void genException(int NP) {
            int x;
            int numb[] = new int[5];

            System.out.println("Received " + NP);

            try
            {
                switch (NP)
                {
                    case 0:
                        x = 10 / NP;
                        break;
                    case 1:
                        numb[7] = 7;
                        break;
                    case 2:
                        return;
                }

            } catch (ArithmeticException e) {
                System.out.println("Can't manage!");
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not found.");
                return;
            } finally {
                System.out.println("Please try Later");
            }


        }
    }

}
