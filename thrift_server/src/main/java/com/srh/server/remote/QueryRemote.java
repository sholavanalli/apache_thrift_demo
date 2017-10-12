package com.srh.server.remote;

import com.srh.server.QueryException;
import com.srh.server.QueryResult;

public interface QueryRemote {
    //    QueryResult runQuery(String expression, int limit, int offset) throws QueryException;
    QueryResult runQuery(String expression, int limit, int offset, String aggType) throws QueryException;
}
