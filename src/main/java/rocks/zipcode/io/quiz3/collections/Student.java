package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    Map<Lab, LabStatus> map;

    public Student() {
        this(new HashMap<Lab, LabStatus>());
    }

    public Student(Map<Lab, LabStatus> map) {
        this.map = map;
    }

    public Lab getLab(String labName) {

//        Set<Lab> allLabs = map.keySet();
//        Lab toReturn = null;
//
//        for (Lab lab : allLabs) {
//            if(labName == lab.getName()) {
//                toReturn = lab;
//            }
//        }

        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
    map.put(getLab(labName), labStatus);
    }

    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        throw new UnsupportedOperationException("Method not yet implemented");
    }

}
