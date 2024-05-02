package features;

import LiftDataBase.LiftDataBase;

import java.util.List;


public class FeatruesModel {
    private FeaturesView featuresView;

    public FeatruesModel(FeaturesView featuresView) {
        this.featuresView = featuresView;
    }

    public void displayPosition() {
        int position[] = LiftDataBase.getInstance().getPosition();
        featuresView.displayPosition(position);
    }

    public void setMaintanance(int i) {
        if (!(i >= 1 && i <= 5)) {
            featuresView.showErrormsgForManintanance("Invalid input");
            return;
        }
        if (LiftDataBase.getInstance().setMaintanance(i)) {
            featuresView.showSucessmsg("Lift " + i + " is put under maintanace sucessfully");
        } else {
            featuresView.showErrormsgForManintanance("Lift " + i + " is already in maintanance");
        }
    }

    public void revokeMaintanance(int i) {
        if (!(i >= 1 && i <= 5)) {
            featuresView.showErrormsgForManintanance("Invalid input");
            return;
        }
        if (LiftDataBase.getInstance().revokeMaintanance(i)) {
            featuresView.showSucessmsg("Lift " + i + " is ready to function");
        } else {
            featuresView.showErrormsgForManintanance("Lift " + i + " is not in maintanance");
        }
    }

    public void assignLift(int start, int end, int capacity) {
        List<Integer> resPosition=LiftDataBase.getInstance().assignLift1(start, end);
        List<Integer> resPositionSameDir=null;
        System.out.println(resPosition);
        if(resPosition.size()>1){
            resPositionSameDir=LiftDataBase.getInstance().assignLift2SameDirection(resPosition,start,end);
        }
        System.out.println(resPositionSameDir);
        List<Integer> restrict=LiftDataBase.getInstance().assignLiftRestrict(resPositionSameDir,start);
        System.out.println(restrict);
        LiftDataBase.getInstance().assignLiftLeastStop(restrict,start,end);
    }

    public void setPositon(int[] arr) {
        LiftDataBase.getInstance().setPosition(arr);
    }
}
