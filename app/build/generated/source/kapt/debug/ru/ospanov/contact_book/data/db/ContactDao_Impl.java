package ru.ospanov.contact_book.data.db;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import ru.ospanov.contact_book.data.db.model.Contact;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ContactDao_Impl implements ContactDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Contact> __insertionAdapterOfContact;

  private final EntityDeletionOrUpdateAdapter<Contact> __updateAdapterOfContact;

  private final SharedSQLiteStatement __preparedStmtOfDeleteContactById;

  public ContactDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfContact = new EntityInsertionAdapter<Contact>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `contact_book` (`id`,`name`,`surname`,`patronymic`,`phone`,`email`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Contact value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getSurname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSurname());
        }
        if (value.getPatronymic() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPatronymic());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhone());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEmail());
        }
      }
    };
    this.__updateAdapterOfContact = new EntityDeletionOrUpdateAdapter<Contact>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `contact_book` SET `id` = ?,`name` = ?,`surname` = ?,`patronymic` = ?,`phone` = ?,`email` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Contact value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getSurname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSurname());
        }
        if (value.getPatronymic() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPatronymic());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhone());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEmail());
        }
        stmt.bindLong(7, value.getId());
      }
    };
    this.__preparedStmtOfDeleteContactById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM contact_book WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Completable insert(final Contact contacts) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfContact.insert(contacts);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final Contact contact) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfContact.handle(contact);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Maybe<Integer> deleteContactById(final long id) {
    return Maybe.fromCallable(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteContactById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteContactById.release(_stmt);
        }
      }
    });
  }

  @Override
  public Single<Contact> getContactById(final long id) {
    final String _sql = "SELECT * FROM contact_book WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createSingle(new Callable<Contact>() {
      @Override
      public Contact call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSurname = CursorUtil.getColumnIndexOrThrow(_cursor, "surname");
          final int _cursorIndexOfPatronymic = CursorUtil.getColumnIndexOrThrow(_cursor, "patronymic");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final Contact _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpSurname;
            _tmpSurname = _cursor.getString(_cursorIndexOfSurname);
            final String _tmpPatronymic;
            _tmpPatronymic = _cursor.getString(_cursorIndexOfPatronymic);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            _result = new Contact(_tmpId,_tmpName,_tmpSurname,_tmpPatronymic,_tmpPhone,_tmpEmail);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Observable<List<Contact>> observeAll() {
    final String _sql = "SELECT * FROM contact_book";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createObservable(__db, false, new String[]{"contact_book"}, new Callable<List<Contact>>() {
      @Override
      public List<Contact> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSurname = CursorUtil.getColumnIndexOrThrow(_cursor, "surname");
          final int _cursorIndexOfPatronymic = CursorUtil.getColumnIndexOrThrow(_cursor, "patronymic");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final List<Contact> _result = new ArrayList<Contact>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Contact _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpSurname;
            _tmpSurname = _cursor.getString(_cursorIndexOfSurname);
            final String _tmpPatronymic;
            _tmpPatronymic = _cursor.getString(_cursorIndexOfPatronymic);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            _item = new Contact(_tmpId,_tmpName,_tmpSurname,_tmpPatronymic,_tmpPhone,_tmpEmail);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
