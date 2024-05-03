package LiftSetUp;

import LiftDataBase.LiftDataBase;

public class LiftSetUpModel {
    private LiftSetUpView liftSetUpView;

    public LiftSetUpModel(LiftSetUpView liftSetUpView) {
        this.liftSetUpView = liftSetUpView;
    }

    public void setUpCapacity(int[] arr) {
        LiftDataBase.getInstance().setUpCapacity(arr);
    }
}
