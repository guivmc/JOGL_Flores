package com.company.flor;

import com.company.Main;
import com.jogamp.opengl.GL2;

public class Flor2 {

    public static void drawFlower2(GL2 gl)
    {
        gl.glBegin(GL2.GL_LINE_LOOP);

        for(int i=0; i < 360; i++)
        {
            //convert degrees into radians
            float degInRad = i * Main.DEG2RAD;

            float radius = (float) Math.sin(degInRad * 2);

            gl.glVertex2f((float)  Math.cos(degInRad) * radius, (float)  Math.sin(degInRad) * radius);

        }

        gl.glEnd();
    }
}
