package com.ferzerkerx.dao;

import java.util.List;
import com.ferzerkerx.model.Record;

public interface RecordDao extends BaseDao<Record> {
    public void deleteRecordsByArtistId(int artistId);

    List<Record> findRecordsByArtist(int artistId);
}
