package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by wang on 2018/5/3.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
