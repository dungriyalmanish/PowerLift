package android.data.app.powerlift.views;

import android.data.app.powerlift.model.db.Exercise;

import java.util.ArrayList;

public interface IViews {
    interface IMainView {
        void updateData(ArrayList<Exercise> exercises);

        void moveToToday();
    }

    interface ITodayView {
        void updateToday();
    }
}
