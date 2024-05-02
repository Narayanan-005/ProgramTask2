package LiftDataBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiftDataBase {
    int position[] = new int[5];
    int capacity[] = new int[5];

    private List<Integer> list = new ArrayList<>();

    public static LiftDataBase liftDataBase;

    private LiftDataBase() {

    }

    public static LiftDataBase getInstance() {
        if (liftDataBase == null) {
            liftDataBase = new LiftDataBase();
        }
        return liftDataBase;
    }

    public void setUpCapacity(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            capacity[i] = arr[i];
        }
    }

    public int[] getPosition() {
        return position;
    }

    public int[] getCapacity() {
        return capacity;
    }

    public boolean setMaintanance(int i) {
        if (position[i - 1] != -1) {
            position[i - 1] = -1;
            return true;
        }
        return false;
    }

    public boolean revokeMaintanance(int i) {
        if (position[i - 1] == -1) {
            position[i - 1] = 0;
            return true;
        }
        return false;
    }

    public void setPosition(int[] arr) {
        for (int i = 0; i < position.length; i++) {
            position[i] = arr[i];
        }
    }

    public List<Integer> assignLift1(int start, int end) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            if (position[i] == -1) {
                list.add(11);
                continue;
            }
            list.add(Math.abs(start - position[i]));
        }
        while (li.size() != 5) {
            int index = Collections.min(list);
            for (int i = 0; i < list.size(); i++) {
                if (index == list.get(i)) {
                    li.add(i);
                    list.set(i, 11);
                }
            }
        }
        return li;
    }


    public List<Integer> assignLift2SameDirection(List<Integer> resPosition, int start, int end) {
        List<Integer> li = new ArrayList<>();
        if (start < end) {
            for (int i = 0; i < resPosition.size(); i++) {
                if (position[resPosition.get(i)] <= start) {
                    li.add(resPosition.get(i));
                }
            }
            for (int i = 0; i < resPosition.size(); i++) {
                if (position[resPosition.get(i)] > start) {
                    li.add(resPosition.get(i));
                }
            }
        } else {
            for (int i = 0; i < resPosition.size(); i++) {
                if (position[resPosition.get(i)] >= start) {
                    li.add(resPosition.get(i));
                }
            }
            for (int i = 0; i < resPosition.size(); i++) {
                if (position[resPosition.get(i)] < start) {
                    li.add(resPosition.get(i));
                }
            }
        }
        return li;
    }


    public List<Integer>
    assignLiftRestrict(List<Integer> resPositionSameDir, int start) {
        List<Integer> li=new ArrayList<>();
        if(start>5){
            for(int i=0;i<resPositionSameDir.size();i++){
                if(resPositionSameDir.get(i)==2 || resPositionSameDir.get(i)==3 || resPositionSameDir.get(i)==4){
                    li.add(resPositionSameDir.get(i));
                }
            }
        }
        else {
            for(int i=0;i<resPositionSameDir.size();i++){
                if(resPositionSameDir.get(i)==0 || resPositionSameDir.get(i)==1 || resPositionSameDir.get(i)==4){
                    li.add(resPositionSameDir.get(i));
                }
            }
        }
        return li;
    }


    public void assignLiftLeastStop(List<Integer> restrict, int start, int end) {
        if(start<=5 && sta)
    }
}
