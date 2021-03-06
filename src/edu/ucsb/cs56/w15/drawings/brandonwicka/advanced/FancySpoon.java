package edu.ucsb.cs56.w15.drawings.brandonwicka.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.w15.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w15.drawings.utilities.GeneralPathWrapper;
/**
   A Fancy Spoon
      
   @author Brandon Wicka 
   @version for CS56, W15, UCSB, 02/12/2015
   
*/
public class FancySpoon extends Spoon implements Shape
{
    /**
     * Constructor for objects of class Spoon
     */
    public FancySpoon(double length, double width, double x, double y)
    {
	// construct the basic spoon
	super(length, width, x, y);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
       
	//make the design on spoon

	Line2D.Double firstNotch = 
	    new Line2D.Double(x, y + length * 0.875, x + width * 0.3, y + length * 0.875);

	Line2D.Double secondNotch = 
	    new Line2D.Double(x, y + length * 0.825, x + width * 0.3, y + length * 0.825);

	Line2D.Double thirdNotch = 
	    new Line2D.Double(x, y + length * 0.775, x + width * 0.3, y + length * 0.775);


        GeneralPath wholeFancySpoon = this.get();
        wholeFancySpoon.append(firstNotch, false);
        wholeFancySpoon.append(secondNotch, false);
        wholeFancySpoon.append(thirdNotch, false); 
    }

}
