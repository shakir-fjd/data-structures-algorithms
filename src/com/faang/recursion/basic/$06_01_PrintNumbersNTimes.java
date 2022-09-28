/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.recursion.basic;

/**
 * @author SHAKIR
 */
public class $06_01_PrintNumbersNTimes {

  public static void main(String[] args) {
    int times = 4;
    printNumber(times);
  }

  private static void printNumber(int times) {
    if (times <= 0) {
      return;
    }
    printNumber(times - 1);
    System.out.println("Shakir ::::::: ");

  }
}
