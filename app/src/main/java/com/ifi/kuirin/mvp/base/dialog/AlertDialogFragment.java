package com.ifi.kuirin.mvp.base.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

/**
 * Created by ddquy on 7/17/2017.
 */

public class AlertDialogFragment extends DialogFragment {

    public static final String TAG = AlertDialogFragment.class.getSimpleName();

    private static final String KEY_TITLE = "title";

    private static final String KEY_DESC = "desc";

    private static AlertDialogFragment sInstance;

    public static AlertDialogFragment getInstance(String title, String desc) {
        if (sInstance == null) {
            sInstance = new AlertDialogFragment();
            Bundle args = new Bundle();
            args.putString(KEY_TITLE, title);
            args.putString(KEY_DESC, desc);
            sInstance.setArguments(args);
        }
        return sInstance;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String title = getArguments().getString(KEY_TITLE);
        String desc = getArguments().getString(KEY_DESC);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setMessage(desc);
        alertDialogBuilder.setNeutralButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialogBuilder.setPositiveButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        return alertDialogBuilder.create();
    }
}
