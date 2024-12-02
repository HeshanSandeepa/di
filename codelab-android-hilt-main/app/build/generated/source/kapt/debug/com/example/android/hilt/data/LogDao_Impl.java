package com.example.android.hilt.data;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LogDao_Impl implements LogDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Log> __insertionAdapterOfLog;

  private final SharedSQLiteStatement __preparedStmtOfNukeTable;

  public LogDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLog = new EntityInsertionAdapter<Log>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `logs` (`msg`,`timestamp`,`id`) VALUES (?,?,nullif(?, 0))";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Log entity) {
        if (entity.getMsg() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getMsg());
        }
        statement.bindLong(2, entity.getTimestamp());
        statement.bindLong(3, entity.getId());
      }
    };
    this.__preparedStmtOfNukeTable = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM logs";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final Log... logs) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLog.insert(logs);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void nukeTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfNukeTable.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfNukeTable.release(_stmt);
    }
  }

  @Override
  public List<Log> getAll() {
    final String _sql = "SELECT * FROM logs ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "msg");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<Log> _result = new ArrayList<Log>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Log _item;
        final String _tmpMsg;
        if (_cursor.isNull(_cursorIndexOfMsg)) {
          _tmpMsg = null;
        } else {
          _tmpMsg = _cursor.getString(_cursorIndexOfMsg);
        }
        final long _tmpTimestamp;
        _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
        _item = new Log(_tmpMsg,_tmpTimestamp);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
