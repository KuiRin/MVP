package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2;

import com.ifi.kuirin.mvp.base.IBasePresenter;
import com.ifi.kuirin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface IF2FrameLayout_2_Contract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<View> {

        void startAMealPressed();

        void endOfAMealPressed();

        void defecationBeginsPressed();

        void goingToBedPressed();

        void wakeUp();

        void startCamera();
    }

    interface View extends IBaseView {

        void onStartAMeal();

        void onEndOfTheMeal();

        void onDefecationBegins();

        void onGoingToBed();

        void onWakeup();

        void onStartCamera();
    }
}
