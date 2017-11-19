package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public final class WaitlistContract {

    private WaitlistContract() {}

    // COMPLETED (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface
    public static final class WaitlistEntry implements BaseColumns {
        // COMPLETED (2) Inside create a static final members for the table name and each of the db columns
        // TABLE_NAME -> waitlist;
        public static final String TABLE_NAME = "waitlist";
        // COLUMN_GUEST_NAME -> guestName
        public static final String COLUMN_GUEST_NAME = "guest_name";
        // COLUMN_PARTY_SIZE -> partySize
        public static final String COLUMN_PARTY_SIZE = "party_size";
        // COLUMN_TIMESTAMP -> timestamp
        public static final String COLUMN_TIMESTAMP = "create_timestamp";
    }
}
