package e.ib.asystentpacjenta.businesstier.util;

import android.database.sqlite.SQLiteDatabase;

import java.io.File;
import java.util.List;

import e.ib.asystentpacjenta.businesstier.entities.Hint;

public class DBUtills {

    private static final String DROP_DB = "DROP DATABASE IF EXISTS AsystentPacjenta;\n";
    private static final String CREATE_DB = "CREATE DATABASE AsystentPacjenta;\n";
    private static final String CREATE_TABLE = "CREATE TABLE HINTS(getId SMALLINT PRIMARY KEY, getToken VARCHAR(127), getInfo VARCHAR(1023), getModified VARCHAR(63));\n";
    private static final String INSERT_TEMPLATE = "INSERT INTO HINTS VALUES(%s, '%s', '%s', '%s');\n";

    public static boolean createBackup(SQLiteDatabase db, List<Hint> data){
        StringBuilder sb = new StringBuilder();

        sb.append(DROP_DB);
        sb.append(CREATE_DB);
        sb.append(CREATE_TABLE);

        for(Hint h : data){
            sb.append(String.format(INSERT_TEMPLATE, h.getId(), h.getToken(), h.getInfo(), h.getModified()));
        }

        System.out.println(sb.toString());
        File f = new File("backup.xd");


        return true;
    }


    public static void main(String[] args) {


    }
}
