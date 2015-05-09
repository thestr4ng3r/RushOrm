package co.uk.rushexample.testobjects;

import co.uk.rushorm.core.RushObject;
import co.uk.rushorm.core.annotations.RushTableAnnotation;

/**
 * Created by Stuart on 07/05/15.
 */
@RushTableAnnotation
public class Bug34 extends RushObject {

    public static final int CONST = 0;
    private int firstInt = 30;
    private boolean firstBool = false;

    public Bug34(){}

}
