package com.sanjay.GraphixEx;

import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleApplet" width=300 height=100>
</applet>
*/
public class SimpleApplet extends Applet
{
    String msg="";
    // Called first.
    public void init()
    {
        msg="Hello";
    }
    /* Called second, after init().
    Also called whenever the applet is restarted. */
    public void start()
    {
        msg=msg+",Welcome to Applet";
    }

    // whenever the applet must redraw its output, paint( ) is called.
    public void paint(Graphics g)
    {

        g.drawString(msg,20,20);
    }
}
