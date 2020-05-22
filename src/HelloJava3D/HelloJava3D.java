/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloJava3D;

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.media.j3d.BranchGroup;

/**
 *
 * @author aldoe
 */

public class HelloJava3D {
    public HelloJava3D() {
        SimpleUniverse universe = new SimpleUniverse();
        BranchGroup group = new BranchGroup();
        ColorCube cube = new ColorCube(0.5);
        group.addChild(cube);
        universe.getViewingPlatform().setNominalViewingTransform();
        universe.addBranchGraph(group);
    }
    public static void main(String[] args) {
        System.out.println("Running!");
        System.setProperty("sun.awt.noerasebackground", "true");
        new HelloJava3D();
    }
            
}
