package LiftDataBase;

import features.FeatruesModel;

import java.util.ArrayList;
import java.util.Arrays;
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
        list.clear();
        int count=0;
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            if (position[i] == -1) {
                list.add(11);
                count++;
                continue;
            }
            list.add(Math.abs(start - position[i]));
        }
        while (li.size() != 5-count) {
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
    assignLiftRestrict(List<Integer> resPositionSameDir, int start, int end) {
        List<Integer> li = new ArrayList<>();
        if (start > 0 && start <= 5 && end > 5 && end <= 10) {
            li.add(4);
        } else if ((start == 0 && end > 5) || (end == 0 && start > 5) || (start > 5 && end <= 10) || (end > 5 && start <= 10)) {
            for (int i = 0; i < resPositionSameDir.size(); i++) {
                if (resPositionSameDir.get(i) == 2 || resPositionSameDir.get(i) == 3) {
                    li.add(resPositionSameDir.get(i));
                }
            }
        } else {
            for (int i = 0; i < resPositionSameDir.size(); i++) {
                if (resPositionSameDir.get(i) == 0 || resPositionSameDir.get(i) == 1) {
                    li.add(resPositionSameDir.get(i));
                }
            }
        }
        return li;
    }


    public int assignLiftLeastStop(List<Integer> restrict, int start, int end) {
        if (restrict.size() == 1) {
            return restrict.get(0);
        } else if (Math.abs(start - end) + Math.abs(position[restrict.get(0)]-start) <= Math.abs(start - end) + Math.abs(position[restrict.get(1)]-start)) {
            return restrict.get(0);
        } else {
            return restrict.get(1);
        }
    }


    public int assignLiftCapacity(int out, int capacity1, int start, int end) {
        position[out]=end;
        if(capacity1>capacity[out]){
            return capacity1-capacity[out];
        }
        return 0;
    }
}
