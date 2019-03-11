package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.Set;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String labName;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {
        return labName;
    }


}
