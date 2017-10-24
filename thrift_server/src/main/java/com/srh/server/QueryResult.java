package com.srh.server;

import com.srh.server.generated.ThriftQueryOutputRecord;
import com.srh.server.generated.ThriftQueryResult;
import com.srh.server.generated.ThriftQueryType;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class QueryResult {

    private long totalHits;
    private int limit;
    private int offset;
    private QueryType queryType;
    private List<QueryOutputRecord> records;
    private String aggType;

    public QueryResult(long totalHits, int limit, int offset, QueryType queryType, List<QueryOutputRecord> records, String aggType) {
        this.totalHits = totalHits;
        this.limit = limit;
        this.offset = offset;
        this.queryType = queryType;
        this.records = records;
        this.aggType = aggType;
    }

    public long getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(long totalHits) {
        this.totalHits = totalHits;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public QueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryType queryType) {
        this.queryType = queryType;
    }

    public List<QueryOutputRecord> getRecords() {
        return records;
    }

    public void setRecords(List<QueryOutputRecord> records) {
        this.records = records;
    }

    public String getAggType() {
        return aggType;
    }

    public void setAggType(String aggType) {
        this.aggType = aggType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QueryResult that = (QueryResult) o;
        return totalHits == that.totalHits &&
                limit == that.limit &&
                offset == that.offset &&
                queryType == that.queryType &&
                Objects.equals(records, that.records) &&
                Objects.equals(aggType, that.aggType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalHits, limit, offset, queryType, records, aggType);
    }

    public ThriftQueryResult toThrift() {
        ThriftQueryResult tqr = new ThriftQueryResult();
        tqr.setTotalHits(totalHits);
        tqr.setLimit(limit);
        tqr.setOffset(offset);
        tqr.setQueryType(ThriftQueryType.valueOf(queryType.name()));
        // v2.0
        tqr.setAggType(aggType);

        List<ThriftQueryOutputRecord> thriftQueryOutputRecords = records.stream().map(QueryOutputRecord::toThrift)
                .collect(Collectors.toList());

        tqr.setRecords(thriftQueryOutputRecords);
        return tqr;
    }

    public static QueryResult getFromThrift(ThriftQueryResult thriftQueryResult) {
        List<QueryOutputRecord> records = thriftQueryResult.getRecords().stream().map(QueryOutputRecord::getFromThrift)
                .collect(Collectors.toList());
        return new QueryResult(thriftQueryResult.getTotalHits(), thriftQueryResult.getLimit(), thriftQueryResult.getOffset(),
                QueryType.valueOf(thriftQueryResult.getQueryType().name()), records, thriftQueryResult.aggType); // aggType added in v2.0
    }
}
