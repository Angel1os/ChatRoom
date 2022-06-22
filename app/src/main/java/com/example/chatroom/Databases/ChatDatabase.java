package com.example.chatroom.Databases;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ChatDatabase {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo
    public String chat;
}
