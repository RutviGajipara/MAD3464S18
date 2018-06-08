/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rutvi
 */
public class Triangle extends Shape {
    Triangle(int x, int y)
    {
        super(x,y);
    }
    @Override
    void draw()
    {
        System.out.println("drawing triangle at : " + super.x + " and " + super.y);
    }
    //abstract void animate()
    
}
