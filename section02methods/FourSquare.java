package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;

public class FourSquare
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < 4; i++)
    {
      drawSquare();
      Tortoise.turn(90);
    }
  }
  public static void drawSquare()
  {
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(50);
      Tortoise.turn(90);
    }
  }
}
