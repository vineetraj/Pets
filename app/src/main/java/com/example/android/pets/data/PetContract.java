package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by vinee on 13-Mar-17.
 */

public final class PetContract {

    //private constructor for PetContract
    private PetContract(){}

    //Inner class inside the outer contract class
    public final class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * possible values for the gender
         */
        public static final int GENDER_MALE = 0;
        public static final int GENDER_FEMALE = 1;
        public static final int GENDER_UNDEFINED = 2;
    }
}
