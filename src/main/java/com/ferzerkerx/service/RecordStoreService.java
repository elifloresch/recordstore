package com.ferzerkerx.service;

import java.util.Collection;
import java.util.List;
import com.ferzerkerx.model.Artist;
import com.ferzerkerx.model.Record;

public interface RecordStoreService {
    Collection<Artist> findAllArtists();

    List<Record> findRecordsByArtist(int artistId);
}