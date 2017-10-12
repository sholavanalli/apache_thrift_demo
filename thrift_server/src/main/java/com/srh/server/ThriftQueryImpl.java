package com.srh.server;

import com.srh.server.generated.ThriftQueryException;
import com.srh.server.generated.ThriftQueryRemote;
import com.srh.server.generated.ThriftQueryResult;

public class ThriftQueryImpl implements ThriftQueryRemote.Iface {

    // v1.0 code
    /*@Override
    public ThriftQueryResult runQuery(String expression, int limit, int offset) throws ThriftQueryException {
        try {
            System.out.println(String.format("In %s.runQuery with args expression: %s, limit: %d, offset: %d",
                    ThriftQueryImpl.class.getSimpleName(), expression, limit, offset));
            return new QueryImpl().runQuery(expression, limit, offset).toThrift();
        } catch (QueryException e) {
            ThriftQueryException tqe = new ThriftQueryException();
            tqe.setMessage(e.getMessage());
            throw tqe;
        }
    }*/

    @Override
    public ThriftQueryResult runQuery(String expression, int limit, int offset, String aggType) throws ThriftQueryException {
        try {
            System.out.println(String.format("In %s.runQuery with args expression: %s, limit: %d, offset: %d, aggType: %s",
                    ThriftQueryImpl.class.getSimpleName(), expression, limit, offset, aggType));
            return new QueryImpl().runQuery(expression, limit, offset, aggType).toThrift();
        } catch (QueryException e) {
            ThriftQueryException tqe = new ThriftQueryException();
            tqe.setMessage(e.getMessage());
            throw tqe;
        }
    }
}
